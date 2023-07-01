package com.example.learn
fun main(args: Array<String>) {
    var tong =0
    var gt =1
    for(i in 1..10 )
    {
        gt*=i
        tong+=gt
    }
    print(tong)

}