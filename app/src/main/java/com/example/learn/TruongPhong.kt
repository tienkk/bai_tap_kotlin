package com.example.learn

class TruongPhong : NhanVien() {
    override fun tinhLuong(luongcb: Double): Double {
        return luongcb * 50
    }
}