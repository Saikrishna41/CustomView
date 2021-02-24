package com.tp.customview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tp.customview.databinding.ActivityMainBinding
import com.tp.customview.views.CustomView

class MainActivity : AppCompatActivity() {

    private lateinit var mCustomView: CustomView
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mCustomView = binding.cv

        binding.btn.setOnClickListener {
           mCustomView.swapColor()
        }

    }
}