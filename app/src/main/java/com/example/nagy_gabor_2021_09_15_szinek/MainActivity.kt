package com.example.nagy_gabor_2021_09_15_szinek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var layout : RelativeLayout
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    fun init(){
        layout = findViewById(R.id.layout)
        textView = findViewById(R.id.text_view)
    }
}