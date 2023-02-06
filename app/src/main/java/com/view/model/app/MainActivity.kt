package com.view.model.app

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var count = 0
    private lateinit var tvCount: TextView
    private lateinit var btnIncrement: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()

    }

    private fun initView() {
        tvCount = findViewById(R.id.tvCount)
        btnIncrement = findViewById(R.id.btnIncrement)
    }
}