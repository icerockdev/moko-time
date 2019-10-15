/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

package com.icerockdev.library

import dev.icerock.moko.time.Timer
import dev.icerock.moko.time.getCurrentMilliSeconds

class TimeTest {
    private val timer = Timer(intervalMilliSeconds = 1000) {
        val currentTime = getCurrentMilliSeconds()
        println("current time: $currentTime")
        return@Timer true
    }
    private var started = false

    fun start() {
        if(started) return

        started = true
        timer.start()
    }

    fun stop() {
        if(!started) return

        started = false
        timer.stop()
    }
}