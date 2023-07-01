package com.example.learn

fun main(args: Array<String>) {
    for(i in 1..7)
    {
        for(j in 1..7)
        {
            if (
                ((i == 1) && (j == 2 || j == 3 || j == 5 || j == 6)) ||
                ((i == 2) && (j == 1 || j == 4 || j == 7 )) ||
                ((i == 3) && (j == 7 || j == 1)) ||
                ((i == 4) && (j == 7 || j == 1)) ||
                ((i == 5) && (j == 6 || j == 2 ))||
                ((i == 6) && (j == 5 || j == 3)) ||
                ((i == 7 ) && (j == 4) )
            )
                print("* " )
            else
            print("  ")
        }
        println()
    }
}