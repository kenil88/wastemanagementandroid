package com.wastemanagement.core

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import com.wastemanagement.network.NetworkHelper
import com.wastemanagement.preferences.Preferences
import com.wastemanagement.utils.Utility.isRunning
import com.wastemanagement.view.dialog.CustomProgressDialog
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
abstract class BaseActivity : AppCompatActivity() {
    @Inject
    lateinit var preferences: Preferences

    @Inject
    lateinit var networkHelper: NetworkHelper

    private var customProgressDialog: CustomProgressDialog? = null


    /**
     * show progress dialog
     * @param context context of activity
     */
    protected fun showProgress(activity: Activity) {
        try {
            if (customProgressDialog != null && customProgressDialog!!.isShowing) {
                return
            }

            customProgressDialog = CustomProgressDialog(activity)
            if (isRunning(activity))
                customProgressDialog?.show()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    /**
     * hide progress dialog
     */
    protected fun hideProgress() {
        try {
            if (customProgressDialog != null) {
                if (customProgressDialog!!.isShowing) {
                    customProgressDialog!!.dismiss()
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }


}