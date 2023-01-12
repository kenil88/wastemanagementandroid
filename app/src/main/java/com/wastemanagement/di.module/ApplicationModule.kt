package com.wastemanagement.di.module

import android.content.Context
import android.text.TextUtils
import android.util.Log
import com.wastemanagement.BuildConfig
import com.wastemanagement.data.api.ApiHelper
import com.wastemanagement.data.api.ApiHelperImpl
import com.wastemanagement.data.api.ApiService
import com.wastemanagement.preferences.Preferences
import com.wastemanagement.utils.Constants
import com.wastemanagement.utils.Logger.TAG
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.wastemanagement.utils.Utility
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.runBlocking
import okhttp3.*
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.net.CookieManager
import java.net.CookiePolicy
import java.util.*
import java.util.concurrent.TimeUnit
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class ApplicationModule {

    @Provides
    fun provideBaseUrl() = BuildConfig.BASE_URL

    @Provides
    @Singleton
    fun provideOkHttpClient(
        @ApplicationContext appContext: Context,
        userPreferences: Preferences,
    ) =
        run {
            val cookieManager = CookieManager()
            cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL)
            OkHttpClient.Builder()
                .addInterceptor { chain ->
                    val original: Request = chain.request()
                    val request: Request = original.newBuilder()
                        .method(original.method, original.body)
                        .build()
                    var response: Response = chain.proceed(request)

                    response
                }
                .addInterceptor { chain ->
                    chain.proceed(chain.request().newBuilder().also {
                        val token = runBlocking { userPreferences.getPreference(Constants.PrefKeys.userToken) }
                        if (!TextUtils.isEmpty(token)) {
                            it.addHeader(
                                "Authorization", "Bearer $token"
                            )
                        }
                    }.build())
                }
                .also { client ->
                    if (BuildConfig.DEBUG) {
                        val logging = HttpLoggingInterceptor()
                        logging.setLevel(HttpLoggingInterceptor.Level.BODY)
                        client.addInterceptor(logging)
                    }
                    client.connectTimeout(30, TimeUnit.SECONDS)
                    client.readTimeout(30, TimeUnit.SECONDS)
                    client.writeTimeout(30, TimeUnit.SECONDS)
                    client.cookieJar(SessionCookieJar()).build()
                }.build()
        }

    private class SessionCookieJar : CookieJar {
        private var cookies: List<Cookie>? = null
        override fun saveFromResponse(url: HttpUrl, cookies: List<Cookie>) {
            if (url.encodedPath.endsWith("login")) {
                this.cookies = ArrayList(cookies)
            }
        }

        override fun loadForRequest(url: HttpUrl): List<Cookie> {
            return if (!url.encodedPath.endsWith("login") && cookies != null) {
                return cookies!!
            } else Collections.emptyList()
        }
    }

    @Provides
    @Singleton
    fun provideRetrofit(
        okHttpClient: OkHttpClient,
        BASE_URL: String
    ): Retrofit =
        Retrofit.Builder()
            .addConverterFactory(
                GsonConverterFactory.create(
                    GsonBuilder().serializeNulls().create()
                )
            )
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .build()

    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit): ApiService = retrofit.create(ApiService::class.java)

    @Provides
    @Singleton
    fun provideApiHelper(apiHelper: ApiHelperImpl): ApiHelper = apiHelper
}
