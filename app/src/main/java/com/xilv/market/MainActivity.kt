package com.xilv.market

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.xilv.market.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)
        supportActionBar?.setDefaultDisplayHomeAsUpEnabled(true)

        binding.toolbar.setNavigationIcon(R.drawable.profile_picture)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }
}

