package com.example.learn

fun main() {
   data class Data(var name :String, var age:Int)
    var data=Data("Nguyễn Quyết Tiến",22)
    var data1= data.copy()
    data.name= "Nguyễn Linh"
    data.age= 18


    println(data1)
    println(data.name)
    println(data.age)
    println(data1.component1())


}