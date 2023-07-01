package com.example.learn


fun main(args: Array<String>)
{
    var a= arrayOf(1,2,4,5,6,7,3)
    var b= a.filter { x->x%3==0 }
    println(b)


}