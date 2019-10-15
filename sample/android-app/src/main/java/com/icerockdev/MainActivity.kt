/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

package com.icerockdev

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.icerockdev.library.TimeTest

class MainActivity : AppCompatActivity() {

    private val timeTest = TimeTest()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
    }

    fun onStartPressed(view: View) {
        timeTest.start()
    }

    fun onStopPressed(view: View) {
        timeTest.stop()
    }
}
