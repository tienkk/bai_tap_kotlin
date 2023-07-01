package com.example.learn

/*
Bài 1: Viết chương trình tính tổng từ 1 tới gần số nguyên dương n
 */

fun main(args: Array<String>) {
    var a:String? = null
    var sum = 0
    println("Enter an Interger: ")
    a= readLine()
    var  n =a?.toInt() ?:0
    if (n>0)
    {
        for (i in 1 until n)
        {
            sum += i
        }
        println("The sum from 1 to $sum ")
    }
    else
    {
        print("$n is not a positive integer")
    }



}