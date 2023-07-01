package com.example.learn

fun main(args: Array<String>) {
//    var n=0
//    while (n<100)
//    {
//        n++
//        println("n trong vòng lặp = $n")
//        if(n==10)
//            break
//    }
    //continue
    var tong=0
    for (i in 1..5 )
    {
        if(i==3)
            continue
        else {
            println(i)
            tong += i
        }
    }
    println("Tổng = $tong")
}