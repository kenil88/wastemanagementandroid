package com.wastemanagement.ui.auth.activity

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import com.wastemanagement.R
import com.wastemanagement.core.BaseActivity
import com.wastemanagement.databinding.ActivityLoginSignupBinding
import com.wastemanagement.network.Status
import com.wastemanagement.ui.auth.viewmodel.AuthViewModel
import com.wastemanagement.ui.dashboard.acceptor.activity.AcceptorDashboardActivity
import com.wastemanagement.ui.dashboard.acceptor.activity.AcceptorDrawerActivity
import com.wastemanagement.utils.Constants
import com.wastemanagement.utils.Utility

class LoginSignupActivity : BaseActivity(),View.OnClickListener {
    lateinit var binding: ActivityLoginSignupBinding
    private val registerViewModel: AuthViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginSignupBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }


    /**
     * Method is used to initialize data and views
     */
    private fun init()
    {
        binding.btnLogin.setOnClickListener(this)
        binding.txtForgotPassword.setOnClickListener(this)
        binding.txtSignUp.setOnClickListener(this)
        setObserver()
    }

    override fun onClick(p0: View?) {
        when (p0)
        {
            binding.btnLogin->{

                if(checkValidation()) {
                    var params = HashMap<String, String>()
                    params.put("email", binding.edUsername.text.toString().trim())
                    params.put("password", binding.edPassword.text.toString().trim())
                    registerViewModel.login(params)
                }
            }
            binding.txtForgotPassword->
                startActivity(Intent(this@LoginSignupActivity, ForgotPasswordActivity::class.java))
            binding.txtSignUp->
                startActivity(Intent(this@LoginSignupActivity, RegisterActivity::class.java))

        }
    }

    /**
     * Set observer
     */
    private fun setObserver() {
        registerViewModel.loginResponse.observe(this) {
            when (it.status) {
                Status.LOADING -> {
                    showProgress(this)
                }
                Status.SUCCESS -> {
                    hideProgress()
                    it.data?.let { userData ->
                        if(userData.status) {
                            preferences.setPreference(Constants.PrefKeys.userToken,userData.result.token)
                            preferences.setPreference(Constants.PrefKeys.userid,userData.result.userId.toString())
                            preferences.setPreference(Constants.PrefKeys.firstName,userData.result.firstName)
                            preferences.setPreference(Constants.PrefKeys.lastName,userData.result.lastName)
                            preferences.setPreference(Constants.PrefKeys.email,userData.result.email)
                            preferences.setPreference(Constants.PrefKeys.orgName,userData.result.orgName)
                            preferences.setPreference(Constants.PrefKeys.orgContact,userData.result.orgContact)
                            preferences.setPreference(Constants.PrefKeys.orgLocation,userData.result.orgLocation)
                            preferences.setPreference(Constants.PrefKeys.latitude,userData.result.latitude)
                            preferences.setPreference(Constants.PrefKeys.longitude,userData.result.longitude)
                            preferences.setPreference(Constants.PrefKeys.categoryId,userData.result.categoryId.toString())
                            preferences.setPreference(Constants.PrefKeys.categoryName,userData.result.categoryName)
                            var intent=Intent(
                                this@LoginSignupActivity,
                                AcceptorDrawerActivity::class.java
                            )
                            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                            startActivity(intent)
                        }
                        else
                        {
                            Utility.showToastMessage(this,userData.message)
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


    /**
     * Method is used to check all value are valid or not
     */
    fun checkValidation(): Boolean {
        if (TextUtils.isEmpty(binding.edUsername.text.toString().trim())) {
            Utility.showToastMessage(this, "Enter Email Address")
            return false
        }else if (!Utility.isValidEmail(binding.edUsername.text.toString().trim())) {
            Utility.showToastMessage(this, "Enter valid email address")
            return false
        }
        else if (TextUtils.isEmpty(binding.edPassword.text.toString().trim())) {
            Utility.showToastMessage(this, "Enter password")
            return false
        }
        return true
    }

}
