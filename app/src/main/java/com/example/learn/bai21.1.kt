package com.example.learn

import kotlin.random.Random

fun main(args: Array<String>) {
    var M:IntArray = intArrayOf(5,4,5,2,1,1)
    var M2:FloatArray = FloatArray(3)
    M[0] =99

    for (i in M)
    {
        print("$i  ")
    }


    // khởi tạo mảng ngẫu nhiên
    var rd = Random
    var M7:IntArray = IntArray(7)
    for (i in M7.indices)
    {
        M7[i] = rd.nextInt(100)
    }
    println("Mảng ngẫu nhiên")
    for (i in M7)
    {
        print("$i \t")
    }
    println()
    println("Số phần tử của = ${M7.size}")
    //phép gán mảng
    var M9= arrayOf(1,2,3,4,5,3)
    var M10 = M9
    M9[0]= 222
    println(M10[0])
}