package com.example.learn

import java.text.SimpleDateFormat
import java.util.Calendar

fun main(args: Array<String>) {
    var dinhdang =SimpleDateFormat("dd/MM/yyyy")
    println("nhập ngày tháng năm sinh")
    var s= readLine()
    if ( s== null) return
    //ép kiểu
    var dateInput = dinhdang.parse(s)
    var timeNamSinh = Calendar.getInstance()
    timeNamSinh.time = dateInput
    var namSinh = timeNamSinh.get(Calendar.YEAR)
    var ThangSinh = timeNamSinh.get(Calendar.MONTH) +1
    var NgaySinh = timeNamSinh.get(Calendar.DAY_OF_MONTH)
    println("Ngày tháng năm sinh của bạn là  $NgaySinh - $ThangSinh - $namSinh")


    var timeHT = Calendar.getInstance()
    var namHT = timeHT.get(Calendar.YEAR)
    var thangHT = timeHT.get(Calendar.MONTH)
    var ngayHT = timeHT.get(Calendar.DAY_OF_MONTH)
    //Tính tuổi
    var tuoi = -(namSinh - namHT)
    println("Bạn có $tuoi ")



}