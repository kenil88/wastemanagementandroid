package com.wastemanagement.ui.auth.activity

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import com.wastemanagement.core.BaseActivity
import com.wastemanagement.databinding.ActivitySplashBinding
import com.wastemanagement.ui.dashboard.SelectUserActivity
import com.wastemanagement.ui.dashboard.acceptor.activity.AcceptorDashboardActivity
import com.wastemanagement.ui.dashboard.acceptor.activity.AcceptorDrawerActivity
import java.util.*


@SuppressLint("CustomSplashScreen")

class SplashActivity : BaseActivity() {
    private val splashTime = 3000L
    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        startTimer()
    }

    /**
     * Move to next screen
     */

    private fun startTimer() {
        Timer().schedule(object : TimerTask() {
            override fun run() {
                if(preferences.isLogin())
                {
                    startActivity(Intent(this@SplashActivity, AcceptorDrawerActivity::class.java))
                }
                else
                {
                    startActivity(Intent(this@SplashActivity, SelectUserActivity::class.java))
                }

                finish()
            }
        }, splashTime)
    }
}
