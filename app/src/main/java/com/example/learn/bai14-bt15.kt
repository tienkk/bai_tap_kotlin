package com.example.learn

fun main(args: Array<String>) {
    var n=1
    println("Các số hoàn hảo trong 1000 là :")

    while(n<=1000)
    {
        var tong=0
        //check tổng bằng bao nhiêu
        for (i in 1..(n/2))
        {
            if(n % i == 0)
                tong+=i
        }
        //kiểm tra số hoàn hảo
        if(tong==n)
        {
            print("$n ")
        }
        // tăng giá trị 1 đơn vị
        n++
    }
}