package com.example.learn
/*
Viết chương trình Java mà khi chạy, màn hình console sẽ cho phép ta nhập vào một số nguyên, in ra màn hình “Đây là số nguyên dương”
Nếu số vừa nhập vào là một số lớn hơn hoặc bằng 0, ngược lại in ra “Đây là số nguyên âm”.
 */
fun check(num:Int)
{
    if(num == 0)
        print("Đây là số 0")
    else if(num > 0)
        print("Đây là số nguyên dương ")
    else if (num < 0)
        print("Đây là số nguyên âm $num ")
}

fun main(args: Array<String>) {
    print("Nhập số: ")
    var s:String? = readLine()
    if(s != null)
    {
        var so = s.toInt()
        check(so)
    }
}