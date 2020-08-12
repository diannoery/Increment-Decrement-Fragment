package com.example.fragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.View
import kotlinx.android.synthetic.main.fragment__show__counter.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun dataShow(dataCounter: String) {
        showCounter.text = dataCounter
    }



}