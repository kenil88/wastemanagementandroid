package com.wastemanagement.ui.dashboard.acceptor.activity

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.wastemanagement.R
import com.wastemanagement.core.BaseActivity
import com.wastemanagement.databinding.ActivityAcceptorDrawerBinding
import com.wastemanagement.network.Status
import com.wastemanagement.ui.dashboard.viewmodel.ProfileVIewModel
import com.wastemanagement.utils.Constants
import com.wastemanagement.utils.Utility

class AcceptorDrawerActivity : BaseActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityAcceptorDrawerBinding
    private val profileViewModel: ProfileVIewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAcceptorDrawerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()

    }
    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_acceptor_drawer)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    /**
     * Method is used to initialize data and ui
     */
    private fun init()
    {

        setSupportActionBar(binding.appBarAcceptorDrawer.toolbar)
        val navController = findNavController(R.id.nav_host_fragment_content_acceptor_drawer)
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home, R.id.nav_update_profile
            ), binding.drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        binding.navView.setupWithNavController(navController)
        handleNavigationClick()
        updateDrawerData()
        setObserver()

    }

    /**
     * Model class is used to handel navigation drawer click
     */
    private fun handleNavigationClick()
    {
        binding.navView.menu.findItem(R.id.nav_deactivate_account).setOnMenuItemClickListener {
            binding.drawerLayout.close()
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
            true
        }
        binding.navView.menu.findItem(R.id.nav_logout).setOnMenuItemClickListener {
            binding.drawerLayout.close()
            Constants.logout(this,preferences)
            true
        }
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

    fun updateDrawerData()
    {
        var headerView=binding.navView.getHeaderView(0)
        headerView.findViewById<TextView>(R.id.txtHeaderOrganizatonName).setText(preferences.getPreference(Constants.PrefKeys.orgName))
        headerView.findViewById<TextView>(R.id.txtHeaderOrganzationEmail).setText(preferences.getPreference(Constants.PrefKeys.email))
    }

}