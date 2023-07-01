package com.example.learn

fun main(args: Array<String>) {
    var a= arrayOf(1,3,5,7)
    var b=a.filter { x->x%3==0 }
    println(b)
}