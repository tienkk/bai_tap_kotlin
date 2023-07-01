package com.example.learn

fun main(args: Array<String>) {
    while (true)
    {
        println("Nhập n:")
        var n:Int? = readLine()?.toInt()
        if (n!=null)
        {
            var demUoc=0
            for(i in 1..n )
                if (n%i==0)
                    demUoc++
            if (demUoc==2)
            {
                println("$n là số nguyên tố")
            }else
            {
                println("$n không phải số nguyên tố ")
            }
        }
        println("Bạn muốn thoát chương trình không")
        var s:String? = readLine()
        if(s!=null){
            if (s=="Y"||s=="y")
                break
        }
    }
}