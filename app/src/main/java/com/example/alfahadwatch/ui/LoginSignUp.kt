package com.example.alfahadwatch.ui

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.alfahadwatch.R
import com.example.alfahadwatch.adapters.LoginSignupPagerAdapter
import com.google.android.material.tabs.TabLayout

class LoginSignUp : AppCompatActivity() {

    private lateinit var vpLoginSignup: ViewPager
    private lateinit var tlLoginSignup: TabLayout
    private lateinit var loginSignUpPagerAdapter: LoginSignupPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_sign_up)

        init()

    }

    private fun init() {
        findViews()
        setStatusBar()
        setupViewPager()
    }

    private fun setStatusBar() {
        window.decorView.systemUiVisibility = (
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)
        window.statusBarColor = Color.TRANSPARENT
    }

    private fun setupViewPager() {
        loginSignUpPagerAdapter = LoginSignupPagerAdapter(supportFragmentManager)
        tlLoginSignup.setupWithViewPager(vpLoginSignup)
        vpLoginSignup.adapter = loginSignUpPagerAdapter
    }

    private fun findViews() {
        vpLoginSignup = findViewById(R.id.vp_login_signup)
        tlLoginSignup = findViewById(R.id.tl_login_signup)
    }
}
