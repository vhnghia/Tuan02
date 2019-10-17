package com.example.baitaptuan2new_bai1;

public class NhanVien {
    private String id;
    private String ten;
    private boolean gioiTinh;

    public NhanVien(){

    }

    public NhanVien(String id, String ten, boolean gioiTinh) {
        this.id = id;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return this.id + "-" + this.ten;
    }
}
