package com.example.learn

fun main(args: Array<String>) {
    var so = ""
    var chuoi = ""
//    var khoangTrang = 0
    println("Nhập 1 chuỗi")
    var s:String? = readLine()
    if (s == null) return
    for(i in s)
    {
        if(i.isLetter())
        {
        chuoi += i
        }
        else if(i.isDigit())
        {
        so += i
        }
        else if(i.isWhitespace())
        {
//            khoangTrang += i
        }
    }
    println("số= $so")
    println("chuoi = $chuoi")
//    println("Khoảng trắng = $khoangTrang")
}
