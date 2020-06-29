package com.example.alfahadwatch.ui

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.alfahadwatch.R
import com.example.alfahadwatch.adapters.FavouriteAdapter

class MyFavouriteActivity : AppCompatActivity() {

    private lateinit var rvMyFavourite: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_favourite)

        findView()
        init()

    }

    private fun init() {
        setStatusBar()
        setUpFavouriteRecycler()
    }

    private fun setStatusBar() {
        window.decorView.systemUiVisibility = (
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)
        window.statusBarColor = Color.TRANSPARENT
    }

    private fun setUpFavouriteRecycler() {
        var favouriteAdapter: FavouriteAdapter = FavouriteAdapter()
        var gridLayoutManager: GridLayoutManager = GridLayoutManager(this, 2)
        rvMyFavourite.layoutManager = gridLayoutManager
        rvMyFavourite.adapter = favouriteAdapter
    }

    private fun findView() {
        rvMyFavourite = findViewById(R.id.rv_my_favourite)
    }
}
