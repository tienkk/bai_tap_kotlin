package com.example.learn

import kotlin.math.sqrt

/*
 Viết chương trình nhập vào số nguyên n với n>0 từ bàn phím
    - Cho biết số đó có phải là số nguyên tố
    (Số nguyên tố là số > 1, và chỉ chia hết cho 1 và chính nó)
    - Kết thúc chương trình hỏi người dùng :
    Bạn có muốn tiếp tục sử dụng phân mềm không. Nếu chọn không thì thoát chương trình
 */
fun isPrime(number:Int):Boolean{
    if(number<=1)
        return false
    for (i in 2 until number){
        if (number%i == 0)
            return false
    }
    return true
}


fun thoat(){
    while (true){
        var bt:String=""
        println("Bạn có muốn thoát chương trình không(Y/N)")
        bt= readLine()?.toString()?:""
        if(bt.equals("Y", ignoreCase = true)){
            break
        }
    }
}

fun main() {
    println("Nhập số n :")
    var n = readLine()?.toIntOrNull()

    if (n != null && n > 1 && isPrime(n)) {
        println("$n là số nguyên tố.")
    } else {
        println("$n không phải là số nguyên tố.")
    }
    thoat()





}