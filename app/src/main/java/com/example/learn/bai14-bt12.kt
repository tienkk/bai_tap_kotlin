package com.example.learn

fun main(args: Array<String>) {
    var n:Int
    var tong=0
    print("Nhập n: ")
    var input:String? = readLine()
    if (input != null)
    {
        n = input.toInt()
        for (i in 1..n step 2)
        {
            if (i==3){
                continue
            }
            tong+=i
        }
        print("tổng các số lẻ đến $n = $tong")
    }
}