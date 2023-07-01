package com.example.learn

class PhoPhong : NhanVien() {
    override fun tinhLuong(luongcb: Double): Double {
        return 40*luongcb
    }
}