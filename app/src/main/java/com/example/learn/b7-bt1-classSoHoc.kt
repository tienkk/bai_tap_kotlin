package com.example.learn

class `b7-bt1-classSoHoc` {
    var numberOne:Double=0.0
    var numberTwo:Double=0.0

    constructor(numberOne:Double,numberTwo:Double){
        println("Nhập số thứ 1 :")
        var n1= readLine()?.toDoubleOrNull()?:0.0
        n1=numberOne
        print("số 1 =$numberOne")
        println("Nhập số thứ 2 : ")
        var n2= readLine()?.toDoubleOrNull()?:0.0
        n2=numberTwo
        print("số 1 =$numberTwo")


    }


}