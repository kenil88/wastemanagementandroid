package com.wastemanagement

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class WasteManagementApp : Application() {

    override fun onCreate() {
        super.onCreate()
    }
}
