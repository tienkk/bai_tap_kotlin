package com.example.learn

fun main(args: Array<String>) {
    for (i in 1..15)
    {
        for(j in 1..15)
        {
            if (
                ((j == 1) && (i == 11)) ||
                ((j == 2) && (i == 11 || i == 12|| i == 13 || i ==14 || i == 15)) ||
                ((j == 3) && (i == 11) )||
                ((j == 5) && (i == 9 || i == 11 || i == 12|| i == 13 || i ==14 || i == 15)) ||
                ((j == 7) && (i == 9 || i == 11 || i == 12|| i == 13 || i ==14 || i == 15)) ||
                ((j == 8) && (i == 8 || i == 11 || i == 13 || i == 15)) ||
                ((j == 9) && (i == 6 || i == 9 || i == 11 || i == 13 || i == 15) )||
                ((j == 10) && (i == 5)) ||
                ((j == 11) &&(i == 11 || i == 12|| i == 13 || i == 14 || i == 15) )||
                ((j == 12) && (i == 12)) ||
                ((j == 13) && (i == 13)) ||
                ((j == 14) && (i == 14)) ||
                ((j == 15) && (i == 11 || i == 12|| i == 13 || i == 14 || i == 15))
            )
            {
                print("* ")
            }
                else{
                    print("  ")
            }
        }
        println()
    }
}