package com.example.alfahadwatch.ui

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.alfahadwatch.R
import com.example.alfahadwatch.adapters.CompareAdapter

class CompareActivity : AppCompatActivity() {

    private lateinit var rvCompare: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_compare)

        findViews()
        init()

    }

    private fun init() {
        setStatusBar()
        setUpCompareRecycler()
    }

    private fun setStatusBar() {
        window.decorView.systemUiVisibility = (
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)
        window.statusBarColor = Color.TRANSPARENT
    }

    private fun setUpCompareRecycler() {
        var compareAdapter: CompareAdapter = CompareAdapter()
        var linearLayoutManager: LinearLayoutManager = LinearLayoutManager(this)
        rvCompare.layoutManager = linearLayoutManager
        rvCompare.adapter = compareAdapter
    }

    private fun findViews() {
        rvCompare = findViewById(R.id.rv_compare)
    }
}
