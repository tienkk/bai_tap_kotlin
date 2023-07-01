package com.example.learn

import java.lang.Exception

fun Thuong(a:Int,b:Int):Int
{
if (b==0)
    throw Exception("Mẫu bằng 0")
    return a/b
}


fun main(args: Array<String>) {
    try {
     var c =Thuong(5,1)
        println(c)
    }
    catch (e:Exception)
    {
println(e.message)
    }
    finally
    {
    println("Đã đăng xuất ")
    }
    println("Doạn code phía sau")
}