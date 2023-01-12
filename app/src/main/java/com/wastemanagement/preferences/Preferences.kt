package com.wastemanagement.preferences

import android.content.Context
import android.content.SharedPreferences
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKeys
import com.wastemanagement.utils.Constants
import com.wastemanagement.utils.Utility
import com.google.gson.Gson
import com.wastemanagement.ui.auth.model.LoginResponse
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class Preferences @Inject constructor(@ApplicationContext private val context: Context) {

    private lateinit var pref: SharedPreferences
    var masterKeyAlias = MasterKeys.getOrCreate(MasterKeys.AES256_GCM_SPEC)

    init {
        pref = EncryptedSharedPreferences.create(
            Utility.commonCentsPref,
            masterKeyAlias,
            context,
            EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
            EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
        )
    }


    fun getPreference(key: String): String? {
        return pref.getString(key, "") // getting String
    }

    // token
    fun setPreference(key: String, value: String) {
        val editor: SharedPreferences.Editor = pref.edit()
        editor.putString(key, value) // Storing long
        editor.apply() // commit changes
    }

    fun removePreference(ctx: Context, key: String) {
        val editor: SharedPreferences.Editor = pref.edit()
        editor.remove(key); // will delete key name
        editor.apply(); // commit changes
    }

    fun getPreference(ctx: Context, key: String): String? {
        return pref.getString(key, ""); // getting String
    }


    fun isLogin(): Boolean {
        return !Utility.isEmpty(getPreference(Constants.PrefKeys.userToken))
    }
}
