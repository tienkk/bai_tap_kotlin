package com.example.learn

fun adddition( a:Double,b:Double)
{
println("$a + $b = ${a+b}")
}
fun subtraction( a:Double,b:Double)
{
    println("$a - $b = ${a-b}")
}fun Multiplication( a:Double,b:Double)
{
    println("$a * $b = ${a*b}")
}fun devision( a:Double,b:Double)
{
    if(b==0.0)
    {
        println("Phương trình ko có nghiệm ")
    }
    else
        println("$a / $b = ${a/b} ")
}
fun main(args: Array<String>) {
    println("Nhập a: ")
    var a:Double? = readLine()?.toDouble()
    println("Nhập b")
    var b:Double? = readLine()?.toDouble()
    println("Nhập phép muốn tính ")
    var c:String? = readLine()
    if (a != null && b!= null && c != null)
    {
//        if (c=="+")
//            adddition(a,b)
//        else if (c=="-")
//            subtraction(a,b)
//        else if (c == "*")
//            Multiplication(a,b)
//        else if(c == "/")
//            devision(a,b)
//        else
//            println("Bạn nhập sai")
        when(c)
        {
            "+"-> println("$a + $b =${a+b} ")
            "-"-> println("$a - $b = ${a-b}")
            "*"-> println("$a * $b = ${a*b}")
            "/"->if(b==0.0)
                println("Phép chia ko chia chia cho 0")
                else
                println("$a / $b = ${a/b}")
            else -> println("Nhập sai")
        }
    }
}

