package com.example.learn
/*
Bài 4: Nhập vào 1 tháng cho biết tháng đó nằm trong mùa nào trong năm.
     - Nếu là mùa Xuân thì tính giá trị biểu thức
       S = 1+2+3+...+n (n>0)
     - Nếu là mùa Hạ tính giá trị biếu thức
       Q = 0 + 1/2 + 2 + 9/2 + ... + n^2/2
 */

fun main(args: Array<String>) {
    var n:Int? = null
    var sum = 0
    print("Nhập 1 tháng ")
    n = readLine()?.toInt()
    if(n == 1 || n == 2 || n == 3){
        for(i in 0..n)
            sum+=i
        println("Mùa Xuân")
        print("Tổng = $sum")
    }
    else if((n == 3)||(n == 4)|| (n == 5)){
        for(i in 0..n){
            sum =  (n * n) / 2
        }
        println("Mùa hè")
        print("Tổng = $sum")
    }



}
