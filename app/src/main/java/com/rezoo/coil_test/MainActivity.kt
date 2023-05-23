package com.rezoo.coil_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import coil.load
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView.load("https://picsum.photos/200/300")
        Log.d("MainActivity","picture showing")
    }
}