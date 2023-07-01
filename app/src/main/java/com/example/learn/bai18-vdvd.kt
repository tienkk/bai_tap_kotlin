package com.example.learn

import kotlin.random.Random


fun play()
{
    var rd= Random
    var soMay = rd.nextInt(100)

    println(soMay)
    var dem = 1
    while (true)
    {
        println(" đoán số ")
        var nguoiDoan:Int? = readLine()?.toInt()
        if(nguoiDoan==null) return
        if(dem==7)
        {
            println("Bạn đã chơi hết 7 lần, bạn đã thua ")
            break
        }
        else
        {
            dem++
            if (nguoiDoan == soMay)
            {
                println("Bạn đã đoán đúng ")
                break
            }
            else if ( nguoiDoan<soMay)
            {
                println("Nhỏ hơn máy ")
            }
            else
            {
                println("Lớn hơn máy ")
            }
        }
    }
}



fun main(args: Array<String>) {
while (true)
{
    play()
    println("bạn muốn chơi tiếp ko")
    var s:String?  = readLine()
    if (s!=null)
    {
        if(s=="Y"||s=="y")
        {
            println("Thanks")
            break

        }
    }


}





}