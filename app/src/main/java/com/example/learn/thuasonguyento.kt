package com.example.learn

fun thuasonguyento( n:Int){
    var m = n
    var i = 2
    while (m > 1) {
        if (m % i == 0) {
            print("$i ")
            m = m /  i
        } else {
            i++
        }
    }
}

fun main(args: Array<String>) {
    var x:Int? = null
    println("Nhập số muốn ")
    var s= readLine()?.toInt()
    if (s != null) {
        thuasonguyento(s)
    }
}