package com.example.learn

fun  TinhTong(a:Int ,b:Int,c:Int):Int
{
return a + b +  c
}

fun XinChao()
{
    println("Xin chào")
}
fun xinchao2(s:String)
{
    if(s=="Nam")
        println("Boy !")
    if (s=="Nữ")
        println("Girl !")
}

fun main(args: Array<String>) {
var Tong = TinhTong(1,2,3)
    println(Tong)
    xinchao2("Nữ")
}