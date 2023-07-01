package com.example.learn

fun main(args: Array<String>) {
    for (i in 10..50 )
    {
        if(i%3==0)
        {
          println("số chia hết cho 3 là $i")
        }
    }
//    fun main(args: Array<String>) {
//        (10..50).filter { it % 3 == 0 }
//            .forEach { println("Số chia hết cho 3 là $it") }
//    }

}