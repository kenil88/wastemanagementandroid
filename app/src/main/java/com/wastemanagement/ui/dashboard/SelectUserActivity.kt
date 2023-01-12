package com.wastemanagement.ui.dashboard

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.wastemanagement.core.BaseActivity
import com.wastemanagement.databinding.ActivitySelectUserBinding
import com.wastemanagement.ui.auth.activity.LoginSignupActivity
import com.wastemanagement.ui.dashboard.donor.category.activity.DonationCategoryActivity

class SelectUserActivity : BaseActivity(), View.OnClickListener {
    private lateinit var binding: ActivitySelectUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
    }

    /**
     * Method is used to initialize all the data and UI
     */
    private fun init() {

        binding.btnAcceptor.setOnClickListener(this)
        binding.btnDonar.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {

        when (p0) {
            binding.btnAcceptor -> {
                startActivity(Intent(this@SelectUserActivity, LoginSignupActivity::class.java))
            }
            binding.btnDonar -> {
                startActivity(Intent(this@SelectUserActivity, DonationCategoryActivity::class.java))
            }
        }

    }
}