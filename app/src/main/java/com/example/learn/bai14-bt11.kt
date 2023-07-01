package com.example.learn

fun main(args: Array<String>) {
    var a:Int
    var tong = 0
    print("Nhập số a: ")
    var input:String? = readLine()
    if(input != null)
    {
      a = input.toInt()
      if(a%2==0){
          for(i in 0..a step 2)
          {
           tong+=i
          }
          println("Tổng các số chẵn = $tong")
      }else
      {
          println("không tính tổng lẻ")
      }
    }
}
