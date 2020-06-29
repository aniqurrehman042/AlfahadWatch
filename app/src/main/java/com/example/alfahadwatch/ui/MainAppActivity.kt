package com.example.alfahadwatch.ui

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.alfahadwatch.R
import com.example.alfahadwatch.ui.fragments.*
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainAppActivity : AppCompatActivity() {

    private lateinit var bnvBottomBar: BottomNavigationView
    private lateinit var clFragment: ConstraintLayout
    private lateinit var ivNotification: ImageView
    private lateinit var ivMessage: ImageView

    private var fragments: ArrayList<Fragment> = ArrayList()
    private lateinit var fragmentManager: FragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_app)

        findViews()
        init()

    }

    private fun findViews() {
        bnvBottomBar = findViewById(R.id.bnv_bottom_bar)
        clFragment = findViewById(R.id.cl_fragment)
        ivNotification = findViewById(R.id.iv_notification)
        ivMessage = findViewById(R.id.iv_message)
    }

    private fun init() {
        setStatusBar()
        initializeFragmentsAndManager()
        setListeners()
        setUpBottomBar()
    }

    private fun setListeners() {
        ivNotification.setOnClickListener {
            startActivity(Intent(this@MainAppActivity, MyFavouriteActivity::class.java))
        }

        ivMessage.setOnClickListener {
            startActivity(Intent(this@MainAppActivity, CompareActivity::class.java))
        }
    }

    private fun initializeFragmentsAndManager() {
        fragmentManager = supportFragmentManager
        fragments.add(HomeFragment())
        fragments.add(SearchFragment())
        fragments.add(CartFragment())
        fragments.add(ProfileFragmentNew())
        fragments.add(MoreFragmentNew())
    }

    private fun setUpBottomBar() {
        bnvBottomBar.setOnNavigationItemSelectedListener {

            return@setOnNavigationItemSelectedListener when (it.itemId) {
                R.id.home -> {
                    startFragment(fragments[0])
                    true
                }

                R.id.search -> {
                    startFragment(fragments[1])
                    true
                }

                R.id.cart -> {
                    startFragment(fragments[2])
                    true
                }

                R.id.profile -> {
                    startFragment(fragments[3])
                    true
                }

                R.id.more -> {
                    startFragment(fragments[4])
                    true
                }

                else -> {
                    false
                }
            }
        }
    }

    private fun startFragment(fragment: Fragment) {
        fragmentManager.beginTransaction()
            .replace(R.id.cl_fragment, fragment)
            .commit()
    }

    private fun setStatusBar() {
        window.decorView.systemUiVisibility = (
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)
        window.statusBarColor = Color.TRANSPARENT
    }
}
