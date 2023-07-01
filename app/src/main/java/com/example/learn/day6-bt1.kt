package com.example.learn

/*
Cho mảng số nguyen A = arrayOf(1,8,101,3,99.196)
    - Tìm số lớn nhất trong một mảng số.
    - Sắp xếp theo thứ tự tăng dần
    - Tính tổng các số trong mảng
    - Xuất ra các số trong mảng chia hết cho 2
 */
fun main(args: Array<String>) {
    var A = arrayOf(1, 8, 101, 3, 99.196)
    var  max = A.maxOfOrNull { it.toDouble() }
    println("GTLN là : $max")


}