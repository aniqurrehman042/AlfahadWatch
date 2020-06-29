package com.example.alfahadwatch.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.alfahadwatch.ui.fragments.SignInFragment
import com.example.alfahadwatch.ui.fragments.SignUpFragment

class LoginSignupPagerAdapter(private var fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

    private var signInFragment: SignInFragment = SignInFragment()
    private var signUpFragment: SignUpFragment = SignUpFragment()

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                signInFragment
            }

            1 -> {
                signUpFragment
            }

            else -> {
                signInFragment
            }
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> {
                "Sign In"
            }

            1 -> {
                "Sign Up"
            }

            else -> {
                "Sign In"
            }
        }
    }
}