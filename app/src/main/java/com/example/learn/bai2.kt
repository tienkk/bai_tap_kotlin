package com.example.learn

fun main(args: Array<String>) {

    var n: Int = 0
    print("Enter a number integer: ")
    n = readLine()?.toInt() ?: 0
    if (n > 0) {
        var fibA = 0
        var fibB = 1
        if (n == 1) {
            print("The first $n fibonacci number: $fibA")
        } else {
            print("The first $n fibonacci number: $fibA $fibB ")
            for (i in 1..n - 2) {
                val fibN = fibA + fibB
                print("$fibN ")
                fibA = fibB
                fibB = fibN
            }
        }
    } else {
        println("$n must be greater than 0")
    }
}