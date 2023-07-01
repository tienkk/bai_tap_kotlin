package com.example.learn

import java.text.SimpleDateFormat
import java.util.Calendar

fun main(args: Array<String>) {
    var cal = Calendar.getInstance()
    var nam= cal.get(Calendar.YEAR)
    var thang = cal.get(Calendar.MONTH) +1
    var ngay = cal.get(Calendar.DAY_OF_MONTH)
    println("$ngay-$thang-$nam")

    // đặt ngày tháng năm
    cal.set(Calendar.YEAR,1990)
    cal.set(Calendar.MONTH,6)
    cal.set(Calendar.DAY_OF_MONTH,19)
    var nam1= cal.get(Calendar.YEAR)
    var thang1 = cal.get(Calendar.MONTH)
    var ngay1 = cal.get(Calendar.DAY_OF_MONTH)
    println("$ngay1 - $thang1 - $nam1")

    var date = cal.time
    var dinhdang = SimpleDateFormat("dd/MM/yyyy")
    println(dinhdang.format(date))
    var dinhdang2= SimpleDateFormat("dd/MM/yyyy hh/mm/ss a")
    println(dinhdang2.format(date))
}