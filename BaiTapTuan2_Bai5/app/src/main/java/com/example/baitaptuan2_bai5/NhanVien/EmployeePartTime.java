package com.example.baitaptuan2_bai5.NhanVien;

public class EmployeePartTime extends Employee {
    private String loaiNV;


    public String getLoaiNV() {
        return loaiNV;
    }

    public void setLoaiNV(String loaiNV) {
        this.loaiNV = loaiNV;
    }

    public EmployeePartTime(String tenNV, String maNV, String loaiNV) {
        super(tenNV, maNV);
        this.loaiNV = loaiNV;
    }

    @Override
    public double TienLuong() {
        return 150;
    }

    @Override
    public String toString() {
        return "EmployeePartTime{" +
                "loaiNV='" + loaiNV + '\'' +
                '}'+"luong:" + TienLuong();
    }
}
