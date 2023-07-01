package com.example.learn

fun main(args: Array<String>) {

    var M:IntArray = intArrayOf(  1, 8, 3, 2, 5, 9, 7)
    var tong=0
    println("Các phần tử trong mảng:")
    for(i in M)
    {
        print("$i  ")
    }
    println()
    println("Các phần tử đảo ngược:")
    M.reverse()
    for (i in M)
    {
        print("$i  ")
    }
    println()
    M.sort()
    println("Mảng sắp xếp tăng dần")
    for (i in M)
    {
        print("$i  ")
    }
    println()
    for (i in M)
    {
        tong+=i
    }
    println("Tổng các phần tử trong mảng = $tong")
    ///////////////////////////////////////////////////
    var N:IntArray = intArrayOf(  1, 8, 3, 2, 5, 9, 7)
    var index = 0
    var n:Int? = null
    print("Nhập vào 1 số kt phần tử trong mảng ")
    n = readLine()?.toInt() ?:0

    for (i in N.indices)
    {
        if (n == N[i])
        {
            index++
            index = i
        }
    }
    if(index == 0){
        print("so $n không tồn tại trong mảng")
    }
    else{
        print("so $n tồn tại trong mang vị trí ${index+1}")
    }






}