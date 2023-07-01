package com.example.learn

import android.os.Build
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.O)
fun main(args: Array<String>) {
    var a = 6
    var b = 2

    println("Kiểu dữ liệu của a là : " + a::class.java.typeName )

//    a+=3
//    println("a="+ a)
//    a-=5
//    println("a="+ a)

//    a*=2
//    println("a="+ a)

//    a%=5
//    println("a="+ a)

    a=a-(b+7)
    println("a="+ a)





}