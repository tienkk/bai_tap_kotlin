package com.example.learn
/*
Bài 3 : Viết chương trình nhập 1 số từ bàn phím,
    - Nếu là số chẵn thì tính tổng các số chẵn
    - Nếu là số lẻ thì in ra chuỗi "Là số lẻ lên tôi không tính tổng!!!" và thoát chương trình.
 */
fun main(args: Array<String>) {
    var n:Int? = null
    var sum =0
    print("Nhập vào 1 số  " )
    n = readLine()?.toInt() ?:0

    if(n%2 == 0) {
        for (i in 0..n step 2) {
            sum += i
        }
            println("tổng 0 đến $n = $sum")
    }
    else{
        print("Là số lẻ lên tôi không tính tổng!!! ")
    }





}