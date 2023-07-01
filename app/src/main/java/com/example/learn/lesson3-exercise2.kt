package com.example.learn

/*
Bài 2: VIết chương trinh nhập vào 1 số và tính giai thừa.
 */
fun main(args: Array<String>) {
    var factorial:Int =1
    var n:String? =null
    print("Enter an Integer: ")
    n = readLine()
    var input = n?.toInt() ?:0
    if (input > 0)
    {
        for(i in 1 ..input)
        {
         factorial *=i
        }
        print("Factorial of $input = $factorial")
    }else
    {
        print("$input not a positive interger")
    }

}