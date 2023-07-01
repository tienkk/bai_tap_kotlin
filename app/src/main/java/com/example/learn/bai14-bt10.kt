package com.example.learn

fun main(args: Array<String>) {
    // vòng lặp for
//    var n:Int
//    var gt =1
//    println("Nhập n: ")
//    var input:String? = readLine()
//    if(input!=null)
//    {
//        n=input.toInt()
//        for(i in 1..n )
//        {
//            gt*=i
//        }
//        println("giai thừa của $n = $gt")
//    }

// vòng lặp while
    var n:Int
    var gt = 1
    var i = 1
    print("Nhập n: ")
    var input:String? = readLine()
    if(input != null   ){
        n = input.toInt()
        while ( i <= n)
        {
            gt *= i
            i++
        }
        print("kết quả $n! = $gt")
    }

}
