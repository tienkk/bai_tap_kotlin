package com.example.learn

import java.lang.StringBuilder

fun main(args: Array<String>) {
    var s19 = "    Tiến    "
    var s20 = s19.trim()
    println(s20)
    var s28= StringBuilder()
    var s29 = StringBuilder("cdose")
    s29.insert(2,"23")
    s29.append(":))")
//    s29.delete(2,5)
        s29.reverse()
//    println(s29)
//    var s30 = "doicoluu.mp3.mp4"
//    var arr:List<String> = s30.split(".")
//    //duyệt từng phần tử của list
//    for(i in arr)
//    {
//        println(i)
//    }

    var mk= "123abc"
    var ar2 = mk.toCharArray()
    for (j in ar2)
    {
        println(j )
    }
}