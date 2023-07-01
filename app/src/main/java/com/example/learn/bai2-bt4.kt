package com.example.learn

/*
Viết chương trình cho phép người dùng nhập vào mã số sinh viên
Sau đó kiểm tra xem mã số này có đúng với định dạng đã cho hay không.
Định dạng mã số sinh viên là “Bxxxxxxx” với x là số nguyên từ 1-9. (Sử dụng biểu thức chính quy để ràng buộc định dạng)
 */

fun main(args: Array<String>) {
    var check = Regex("B[1-9]\\d{6}")
    println("Nhập mã sinh viên")
    var input:String? = readLine()
        if(input!=null)
    {
        if(check.matches(input))
            println("Mã hợp lệ")
        else
            println("Mã không hợp lệ ")

    }
}