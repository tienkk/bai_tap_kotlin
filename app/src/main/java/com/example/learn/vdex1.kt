package com.example.learn

fun main() {
    println("Tổng: ")
    println(tinhtong(2,3,4,5,6))
}
//parametter list
fun tinhtong(vararg list: Int):Int{
    var tong =0
    for(i in list){
        tong+=i
    }
    return  tong
}