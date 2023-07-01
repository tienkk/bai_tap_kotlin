package com.example.learn

/*
Viết chương trình cho phép nhập vào 3 số
Chương trình sẽ kiểm tra 3 số này có phải là 3 cạnh của một tam giác hay không.
Nếu 3 cạnh tạo thành 1 tam giác thì hãy xác định đó là tam giác gì.
 */

fun check(a:Double,b:Double,c:Double):String
{
    if(a<b+c && b<a+c && c<a+b)
    {
        if( a*a == b*b+c*c || b*b == a*a+c*c || c*c== a*a+b*b)
            return "Đây là tam giác vuông"
        else if((a== b && b==c))
            return "Đây là tam giác đều"
        else if ((a==b || a==c || b==c))
            return "Đây là tam giác cân "
        else if((a*a > b*b+c*c) || (b*b > a*a+c*c) || (c*c > a*a+b*b))
            return "Đây là tam giác tù"
        else
            return "Đây là tam giác nhọn"
    }
    else
    {
    return "3 cạnh a,b,c không phải là 1 tam giác"
    }
}

fun main(args: Array<String>) {
    print("Nhập cạnh a: ")
    var x:Double? = readLine()?.toDouble()
    print("Nhập cạnh b: ")
    var y:Double? = readLine()?.toDouble()
    print("Nhập cạnh c: ")
    var z:Double? = readLine()?.toDouble()
    if(x!=null && y!= null&& z!= null)
    {
        var result = check(x,y,z)
        print(result)
    }


}