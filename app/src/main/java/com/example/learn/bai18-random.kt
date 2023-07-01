package com.example.learn

import kotlin.random.Random

fun main(args: Array<String>) {
    var rd = Random
    var rdNguyen =rd.nextInt(5 )
    println(rdNguyen)
    var rd3  = rd.nextDouble()
    println(rd3)
    /// random số thực >1
    //cách 1
    var rd4 = rd.nextInt(-50,50)
    var rd5 = rd.nextDouble()
    var rd6 = rd4+rd5
    println(rd6)
    var rd7=rd.nextDouble()*10
    println(rd7)
}