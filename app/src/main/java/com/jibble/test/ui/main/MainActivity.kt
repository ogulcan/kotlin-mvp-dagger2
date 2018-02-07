package com.jibble.test.ui.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.jibble.test.R
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by ogulcan on 07/02/2018.
 */
class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        test()
    }

    fun test() {
        hello.setText("Hello world with kotlin extensions")
    }
}