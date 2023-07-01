package com.example.learn

fun main(args: Array<String>) {
    var demSo=0
    var demKiTuThuong =0
    var demKyTuHoa=0
    var demSpace =0
    println("Mời bạn nhập 1 chuỗi:")
    var s:String? = readLine()
    if(s==null) return
    var arr = s.toCharArray()
    // duyệt phần tử của mảng '
    for (i in arr)
    {
        //kt số println(i)
        if(i.isDigit())
            demSo++
        else if(i.isLowerCase())
            demKiTuThuong++
        else if(i.isUpperCase())
            demKyTuHoa++
        else if (i.isWhitespace())
            demSpace++
    }
    println("có $demSo kí tự sô")
    println("có $demKiTuThuong kí tự thường")
    println("có $demKyTuHoa kí tự hoa")
    println("có $demSpace khoảng trắng")

}