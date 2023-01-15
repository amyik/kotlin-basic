package com.amyik.singleton

import java.time.LocalDateTime


fun main() {
    println(Timer.getTimeInString())
    Thread.sleep(1000)
    println(Timer.getTimeInString())
}

object Timer {
    val time: String = LocalDateTime.now().toString()
    fun getTimeInString() : String = "The year is $time"
}