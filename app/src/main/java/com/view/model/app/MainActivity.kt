package com.view.model.app

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private lateinit var tvCount: TextView
    private lateinit var btnIncrement: Button

    private lateinit var mainViewModel : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]
        initView()
        setText()

    }

    private fun initView() {
        tvCount = findViewById(R.id.tvCount)
        btnIncrement = findViewById(R.id.btnIncrement)

        btnIncrement.setOnClickListener {
            increment()
        }
    }

    private fun increment() {
        mainViewModel.increment()
        setText()
    }

    private fun setText() {
        tvCount.text = mainViewModel.count.toString()
    }
}