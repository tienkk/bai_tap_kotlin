package com.example.learn

fun main(args: Array<String>) {
    var emp :NhanVien?=null
    emp=TruongPhong()
    println("Lương : ${emp.tinhLuong(500.0)}")

    emp=PhoPhong()
    println("Luong2 : ${emp.tinhLuong(500.0)}")

}