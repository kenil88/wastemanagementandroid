package com.wastemanagement.ui.auth.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.wastemanagement.R
import com.wastemanagement.core.BaseActivity
import com.wastemanagement.databinding.ActivityForgotPasswordBinding
import com.wastemanagement.network.Status
import com.wastemanagement.ui.auth.viewmodel.AuthViewModel
import com.wastemanagement.utils.Constants
import com.wastemanagement.utils.Utility
import com.wastemanagement.utils.ViewUtils

class ForgotPasswordActivity : BaseActivity(),View.OnClickListener {

    lateinit var binding : ActivityForgotPasswordBinding
    private val registerViewModel: AuthViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityForgotPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    /**
     * Method is used to initialize data and views
     */
    private fun init()
    {
        binding.imgBack.setOnClickListener(this)
        binding.btnSendLink.setOnClickListener(this)
        setObserver()
    }


    /**
     * Set observer
     */
    private fun setObserver() {
        registerViewModel.forgotPasswordResponse.observe(this) {
            when (it.status) {
                Status.LOADING -> {
                    showProgress(this)
                }
                Status.SUCCESS -> {
                    hideProgress()
                    it.data?.let { accountDatail ->
                        if(accountDatail.status) {
                           Utility.showAlertMessage(this@ForgotPasswordActivity,getString(R.string.app_name),accountDatail.message)
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
        when (p0)
        {
            binding.imgBack->
                finish()
            binding.btnSendLink->
                if(checkValidation()) {
                    var params = HashMap<String, String>()
                    params.put("email", binding.edEmail.text.toString().trim())
                    registerViewModel.forgotPassword(params)
                }
        }
    }

    /**
     * Method is used to check all value are valid or not
     */
    fun checkValidation(): Boolean {
        if (TextUtils.isEmpty(binding.edEmail.text.toString().trim())) {
            Utility.showToastMessage(this, "Enter Email Address")
            return false
        }else if (!Utility.isValidEmail(binding.edEmail.text.toString().trim())) {
            Utility.showToastMessage(this, "Enter valid email address")
            return false
        }
        return true
    }
}