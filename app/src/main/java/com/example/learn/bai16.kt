package com.example.learn

import java.lang.Exception

fun main(args: Array<String>) {
    var a = 10
    var b = 0
    try
    {
        var c = a/b
        println(a/b)
    }
    catch (e:Exception)
    {
        e.printStackTrace()
    }
    finally
    {
        println("Thoát khỏi database")

    }

    println("Đoạn code phía sau")
}
