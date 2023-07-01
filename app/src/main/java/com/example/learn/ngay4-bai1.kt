package com.example.learn

import kotlin.math.sqrt

/*
Bài 1 : Viết chương trình nhập vào số nguyên n với n>0 từ bàn phím
    - Cho biết số đó có phải là số nguyên tố
    (Số nguyên tố là số > 1, và chỉ chia hết cho 1 và chính nó)
    - Kết thúc chương trình hỏi người dùng : Bạn có muốn tiếp tục sử dụng phân mềm không. Nếu chọn không thì thoát chương trình
 */

fun main(args: Array<String>) {
    while (true){
        var n:Int? =null
        var s=0

        print("Nhập 1 số kiểm tra số nguyên tố ")
        n= readLine()?.toInt()?:0
        for (i in 1..sqrt(n.toDouble()).toInt()){
            if(n%i==0){
                s+=i
            }
        }
        if (s==1){
            println("$n là số nguyên tố")
        }
        else{
            println("$n không phải số nguyên tố")
        }
        var x:String? = null
        println("Bạn có muốn tiếp tục sử dụng phần mềm không? (Y/N)")
        x= readLine()
        if(x=="y"||x=="Y"){
            break
        }
        else{
            continue
        }
    }
}