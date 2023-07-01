package com.example.learn

fun main(args: Array<String>) {
    var h=5
    for (i in 1..h)
    {
        for(j in 1..h)
        {
            if (j==1||i==5){
                print("$i$j  ")
            }
        }
        println()
    }
}