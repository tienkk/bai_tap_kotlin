package com.example.learn

fun main(args: Array<String>) {
    var a = """
        Tôi chăm học 
        Tôi chịu khó
        Tôi đẹp trai
    """
    var dem = 0
    var lst = a.split(" ")
    for (i in lst){
        if(i.contains("Tôi")){
            dem++
        }

    }
    println("có $dem từ Tôi")



}