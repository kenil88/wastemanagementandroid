package com.wastemanagement.ui.dashboard.acceptor.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.wastemanagement.R
import com.wastemanagement.core.BaseActivity
import com.wastemanagement.databinding.ActivityAcceptorDashboardBinding
import com.wastemanagement.network.Status
import com.wastemanagement.ui.dashboard.acceptor.profile.activity.UpdateProfileActivity
import com.wastemanagement.ui.dashboard.viewmodel.ProfileVIewModel
import com.wastemanagement.utils.Constants
import com.wastemanagement.utils.Utility

class AcceptorDashboardActivity : BaseActivity(), View.OnClickListener {


    lateinit var binding: ActivityAcceptorDashboardBinding
    private val profileViewModel: ProfileVIewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAcceptorDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    /**
     * Method is used to initialize data and views
     */
    private fun init() {
        binding.btnUpdateProfile.setOnClickListener(this)
        binding.btnDeactivateAccount.setOnClickListener(this)
        binding.btnLogout.setOnClickListener(this)
        setObserver()
    }

    /**
     * Set observer
     */
    private fun setObserver() {


        profileViewModel.deactiviateAccountResponse.observe(this) {
            when (it.status) {
                Status.LOADING -> {
                    showProgress(this)
                }
                Status.SUCCESS -> {
                    hideProgress()
                    it.data?.let { accountDatail ->
                        if(accountDatail.status) {
                            MaterialAlertDialogBuilder(
                                this,
                                R.style.AlertDialogTheme
                            )
                                .setCancelable(false)
                                .setTitle(title)
                                .setMessage(accountDatail.message)
                                .setPositiveButton("Ok") { dialog, which ->
                                    dialog.dismiss()
                                    Constants.logout(this,preferences)
                                }
                                .show()
                        }
                        else
                        {
                            Utility.showToastMessage(this,accountDatail.message)
                        }
                    }
                }
                Status.ERROR -> {
                    hideProgress()
                    it.message?.let { it1 ->
                        Utility.showAlertMessage(
                            this,
                            getString(R.string.app_name),
                            it1
                        )
                    }
                }
                Status.NO_INTERNET -> {
                    Toast.makeText(this, it.message, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    override fun onClick(p0: View?) {
        when (p0) {
            binding.btnUpdateProfile -> {
                startActivity(Intent(this, UpdateProfileActivity::class.java))
            }
            binding.btnDeactivateAccount -> {
                MaterialAlertDialogBuilder(
                    this,
                    R.style.AlertDialogTheme
                )
                    .setCancelable(false)
                    .setTitle(title)
                    .setMessage(getString(R.string.deactivate_account_confirmation))
                    .setPositiveButton(getString(R.string.btn_yes)) { dialog, which ->
                        profileViewModel.deactivateAccount(preferences.getPreference(Constants.PrefKeys.userid)!!.toInt())
                    }
                    .setNegativeButton(getString(R.string.btn_no)) { dialog, which ->
                        dialog.dismiss()
                    }
                    .show()
            }
            binding.btnLogout -> {
                Constants.logout(this,preferences)
            }
        }
    }

}