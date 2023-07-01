package com.example.learn

fun main(args: Array<String>) {
    var s:String = "Tvach"
    var s2 = "Tvacadhcadh"
    var s3 = "\"Học học nữa học mãi \""
    println(s3)
    println(s3.length)
    println(s3.indexOf("a"))
    var s10=".mp3"
    var s11 = "tuhoc.mp3"
    var check:Boolean= s11.contains(s10)
    if(check )
        println("có $s10 trong $s11 ")
    else
    {
        println("Không có $s10 trong $s11")
    }
    var s12= "0297428923"
    var s13= s12.substring(2)
    println(s13)
    var s15= s3.replace("học","ngủ")
    println(s15)
}