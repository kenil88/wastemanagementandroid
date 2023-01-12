package com.wastemanagement.utils

import android.content.Context
import android.content.Intent
import com.wastemanagement.preferences.Preferences
import com.wastemanagement.ui.auth.activity.LoginSignupActivity
import com.wastemanagement.ui.dashboard.SelectUserActivity


object Constants {
    const val UnAuthorize = 401
    const val Location = "Location"
    const val Pallet = "Pallet"
    const val SuccessCode = 200
    const val InternalServerError = 500
    const val MSG_NO_INTERNET_CONNECTION = "The internet connection appears to be offline"
    const val MSG_SOMETHING_WENT_WRONG = "Something went wrong"

    object PrefKeys {
        var userid = "userid"
        var userToken="usertoken"
        var email="email"
        var firstName="first_name"
        var lastName="last_name"
        var orgName="org_name"
        var orgLocation="org_location"
        var latitude="latitude"
        var longitude="longitude"
        var orgContact="org_contact"
        var categoryName="category_name"
        var categoryId="category_id"

    }

    object IntentConstants{
        const val CATEGORY_ID="categoryid"
        const val ORGANIZATION_ID="orgid"
        const val ORGANIZATION_NAME="orgname"
    }

    fun logout(
        appContext: Context,
        userPreferences: Preferences
    ) {
        userPreferences.removePreference(
            appContext,
            PrefKeys.userToken
        )

        val intent = Intent(appContext, SelectUserActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        appContext.startActivity(intent)
    }
}
