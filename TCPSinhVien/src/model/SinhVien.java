/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Asus
 */
public class SinhVien implements Serializable {

    private String ma;
    private String ten;
    private String diaChi;
    private boolean gioiTinh;

    public SinhVien() {
    }

    public SinhVien(String ma, String ten, String diaChi, boolean gioiTinh) {
        this.ma = ma;
        this.ten = ten;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Object[] toObject() {
        String gt = "";
        if (gioiTinh) {
            gt = "Nam";
        } else {
            gt = "Nu";
        }
        return new Object[]{ma, ten, diaChi, gt};
    }

    @Override
    public String toString() {
        return "SinhVien{" + "ma=" + ma + ", ten=" + ten + ", diaChi=" + diaChi + ", gioiTinh=" + gioiTinh + '}';
    }

}
