package com.example.alfahadwatch.ui.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

import com.example.alfahadwatch.R
import com.example.alfahadwatch.ui.MainAppActivity

/**
 * A simple [Fragment] subclass.
 */
class SignInFragment : Fragment() {

    private lateinit var btnSignin: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_sign_in, container, false)

        findViews(view!!)
        init()

        return view
    }

    private fun init() {
        setListeners()
    }

    private fun setListeners() {
        btnSignin.setOnClickListener {
            activity!!.startActivity(Intent(activity, MainAppActivity::class.java))
        }
    }

    private fun findViews(view: View) {
        btnSignin = view.findViewById(R.id.btn_signin)
    }

}
