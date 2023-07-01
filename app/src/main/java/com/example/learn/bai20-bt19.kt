package com.example.learn

fun main(args: Array<String>) {
    var mk:String

    while (true)
    {
        var demSo=0
        var demChu=0
        println("Nhập mk")
        mk = readLine().toString()
        if (mk!=null){
            //kiểm tra độ dài
            if(mk.length<=5)
                println("Mật khẩu phải có ít nhất 6 kí tự  ")
            else // kiểm tra các dk còn lại
            {
                for (i in mk)
                {
                    if (i.isDigit())
                        demSo++
                    else if (i.isLetter())
                        demChu++
                }
                if (demSo*demChu ==0)
                {
                    println("MK không hợp lệ ")
                }
                else
                {
                    print("bạn đã lập mk thành công")
                    break
                }
            }
        }
    }
    //2. cho người dùng nhập mk
    var demDangNhap = 0
    while(true)
    {
        println("NHập mk đăng nhập, lần thử thử $demDangNhap/5")
        var logIn:String? = readLine()
        if (logIn!=null)
        {
            if (demDangNhap == 5)
            {
                println("Bạn đã nhập sai 5 lần ,truy cập bị khóa ")
                break
            }else if(logIn == mk)
            {
                println("Đăng nhập thành công")
                break
            }
            else
            {
                demDangNhap++
            }
        }
    }

}