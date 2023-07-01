package com.example.learn

import kotlin.math.pow
import kotlin.math.sqrt

fun giaiPTB2(a:Double,b:Double,c:Double):String
{
    if (a == 0.0){
        if(b == 0.0 && c == 0.0)
        {
         return "Phương trình có vô số nghiệm"
        }else if(b != 0.0 && c == 0.0)
        {
            return "Phương trình vô nghiệm "
        }
    }else
    {
        var delta =0.0
        delta = b.pow(2) - 4 * a * c
        if(delta < 0.0)
        {
            return "Phương trình vô nghiệm "
        }
        else if(delta == 0.0)
        {
            return "Phương trình có nghiệm duy nhất x = ${(-b) / (2*a)}"
        }
        else
        {
            return "Phương trình có 2 nghiệm phân biệt x1 = ${((-b)+ sqrt(delta)) / 2*a} và x2 = ${((-b)-sqrt(delta)) / 2*a} "
        }
    }
    return " "
}


fun main(args: Array<String>) {
    print("Nhập a= ")
    var a:Double? = readLine()?.toDouble()
    print("Nhập b= ")
    var b:Double? = readLine()?.toDouble()
    print("Nhập c= ")
    var c:Double? = readLine()?.toDouble()
    if (a == null || b == null || c == null) return
    var kq = giaiPTB2(a, b, c)
    println(kq)
}











