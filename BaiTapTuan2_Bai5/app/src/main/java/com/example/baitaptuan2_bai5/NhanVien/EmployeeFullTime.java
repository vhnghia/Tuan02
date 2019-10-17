package com.example.baitaptuan2_bai5.NhanVien;

public class EmployeeFullTime extends Employee {
    private String loaiNV;

    public EmployeeFullTime(String tenNV, String maNV, String loaiNV) {
        super(tenNV, maNV);
        this.loaiNV = loaiNV;
    }

    public String getLoaiNV() {
        return loaiNV;
    }

    @Override
    public double TienLuong() {
        return 500;
    }


    @Override
    public String toString() {
        return "ID: " +super.getMaNV() +","+"Name:" +super.getTenNV()+"---> Full Time = "+TienLuong();
    }
}
