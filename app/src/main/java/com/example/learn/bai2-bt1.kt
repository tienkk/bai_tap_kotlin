package com.example.learn
/*
Viết chương trình cho phép nhập vào một số nguyên dạng số, sau khi chạy thì chương trình sẽ ghi số đó ra dưới dạng chữ.
VD: 1 -> Một, 2 -> Hai, …
 */
fun chuyencoso(number:Int):String
{
    var num = number
    var result =""
    var dv= arrayOf("Một","Hai","Ba","Bốn","Năm","Sáu","Bảy","Tám","Chín")
    var chuc = arrayOf("Mười","Hai mươi","Ba mươi","Bốn mươi","Năm Mươi","Sáu mươi","Bảy mươi","Tám mươi","Chín mươi")

    if(number == 0)
        return "Không"
    if (num < 0) {
        result += "Âm "
        num = -num
    }


    var hangChuc = num / 10
    var hangDonVi = num % 10


    if(hangChuc > 0)
    {
        result += chuc[hangChuc-1  ] + " "
    }
    if(hangDonVi > 0)
            result += dv[hangDonVi -1]
    return  result
    return ""
}


fun main() {
    print("Nhập số cần in: ")
    var number:String? = readLine()
    if(number != null)
    {
        var num = number.toInt()
        if(num != null)
        {
            var tu = chuyencoso(num)
            print("Số $number được chuyển thành $tu")
        }else
            print("số ko hợp lệ ")

    }
}