package com.example.learn

/*
Bài 3 : Viết chương trình nhập 1 số từ bàn phím,
    - Nếu là số chẵn thì tính tổng các số chẵn
    - Nếu là số lẻ thì in ra chuỗi "Là số lẻ lên tôi không tính tổng!!!" và thoát chương trình.
 */


fun main(args: Array<String>) {
    var n:String? = null
    println("Enter a Integer")
    n= readLine()
    var input = n?.toInt() ?:0

}