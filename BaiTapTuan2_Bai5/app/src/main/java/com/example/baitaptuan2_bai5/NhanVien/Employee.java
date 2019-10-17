package com.example.baitaptuan2_bai5.NhanVien;

public abstract class Employee {
    private String tenNV;
    private String maNV;

    public Employee(String tenNV, String maNV) {
        this.tenNV = tenNV;
        this.maNV = maNV;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "tenNV='" + tenNV + '\'' +
                ", maNV='" + maNV + '\'' +
                '}';
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public abstract double TienLuong();

}
