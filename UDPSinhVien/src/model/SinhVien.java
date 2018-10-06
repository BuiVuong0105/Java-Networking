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
public class SinhVien implements Serializable{

    private String ma;
    private String ten;
    private String diachi;
    private boolean gioiTinh;

    public SinhVien() {
    }

    public SinhVien(String ma, String ten, String diachi, boolean gioiTinh) {
        this.ma = ma;
        this.ten = ten;
        this.diachi = diachi;
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

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Object[] toObject() {
        String gt = gioiTinh ? "Nam" : "Nu";
        return new Object[]{ma, ten, diachi, gt};
    }

    @Override
    public String toString() {
        return "SinhVien{" + "ma=" + ma + ", ten=" + ten + ", diachi=" + diachi + ", gioiTinh=" + gioiTinh + '}';
    }

}
