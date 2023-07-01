package com.example.learn

fun main(args: Array<String>) {
    var n:Int
    println("Nhập n>0:")
    var input:String? = readLine()
    if(input != null)
    {
        n = input.toInt()
        while (n>0)
        {
            var x=0
            //check xem có bao nhiêu số chia hết
        for(i in 1..(n/2))
        {
           if(n%i==0)
           {
               x++
           }
        }
            if(x==1)
            {
                print("$n là số nguyên tố")
                break
            }else
            {
                println("$n không phải số nguyên tố ")
                break
            }
        }
    }
}