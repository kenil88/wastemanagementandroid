package com.wastemanagement.core

import android.app.Activity
import android.content.Context
import androidx.fragment.app.Fragment
import com.wastemanagement.network.NetworkHelper
import com.wastemanagement.preferences.Preferences
import com.wastemanagement.view.dialog.CustomProgressDialog
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
open class BaseFragment : Fragment() {

    private var customProgressDialog: CustomProgressDialog? = null

    private lateinit var mContext: Context

    @Inject
    lateinit var preferences: Preferences

    @Inject
    lateinit var networkHelper: NetworkHelper

    override fun onAttach(context: Context) {
        super.onAttach(context)
        this.mContext = context
    }

    /**
     * show progress dialog
     * @param activity activity of activity
     */
    protected fun showProgress(activity: Activity) {
        try {
            if (customProgressDialog != null && customProgressDialog!!.isShowing) {
                return
            }
            customProgressDialog = CustomProgressDialog(activity)
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