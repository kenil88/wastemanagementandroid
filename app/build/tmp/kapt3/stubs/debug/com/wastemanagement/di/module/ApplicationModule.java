package com.wastemanagement.di.module;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007J\u001a\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\fH\u0007\u00a8\u0006\u0017"}, d2 = {"Lcom/wastemanagement/di/module/ApplicationModule;", "", "()V", "provideApiHelper", "Lcom/wastemanagement/data/api/ApiHelper;", "apiHelper", "Lcom/wastemanagement/data/api/ApiHelperImpl;", "provideApiService", "Lcom/wastemanagement/data/api/ApiService;", "retrofit", "Lretrofit2/Retrofit;", "provideBaseUrl", "", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "appContext", "Landroid/content/Context;", "userPreferences", "Lcom/wastemanagement/preferences/Preferences;", "provideRetrofit", "okHttpClient", "BASE_URL", "SessionCookieJar", "app_debug"})
@dagger.Module()
public final class ApplicationModule {
    
    public ApplicationModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final java.lang.String provideBaseUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttpClient(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context appContext, @org.jetbrains.annotations.NotNull()
    com.wastemanagement.preferences.Preferences userPreferences) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull()
    java.lang.String BASE_URL) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.wastemanagement.data.api.ApiService provideApiService(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.wastemanagement.data.api.ApiHelper provideApiHelper(@org.jetbrains.annotations.NotNull()
    com.wastemanagement.data.api.ApiHelperImpl apiHelper) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/wastemanagement/di/module/ApplicationModule$SessionCookieJar;", "Lokhttp3/CookieJar;", "()V", "cookies", "", "Lokhttp3/Cookie;", "loadForRequest", "url", "Lokhttp3/HttpUrl;", "saveFromResponse", "", "app_debug"})
    static final class SessionCookieJar implements okhttp3.CookieJar {
        private java.util.List<okhttp3.Cookie> cookies;
        
        public SessionCookieJar() {
            super();
        }
        
        @java.lang.Override()
        public void saveFromResponse(@org.jetbrains.annotations.NotNull()
        okhttp3.HttpUrl url, @org.jetbrains.annotations.NotNull()
        java.util.List<okhttp3.Cookie> cookies) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.util.List<okhttp3.Cookie> loadForRequest(@org.jetbrains.annotations.NotNull()
        okhttp3.HttpUrl url) {
            return null;
        }
    }
}