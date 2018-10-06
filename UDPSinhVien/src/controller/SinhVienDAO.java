/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.SinhVien;

/**
 *
 * @author Asus
 */
public class SinhVienDAO implements ISinhVienDAO {

    @Override
    public List<SinhVien> getAll() {
        List<SinhVien> listSinhVien = new ArrayList<>();
        String sql = "select *from sinhvien";
        PreparedStatement pst = null;
        ResultSet rs = null;
        Connection conn = new DBConnect().connect();
        if (conn != null) {
            try {
                pst = conn.prepareStatement(sql);
                rs = pst.executeQuery();
                while (rs.next()) {
                    SinhVien sinhVien = new SinhVien(rs.getString("ma"), rs.getString("ten"), rs.getString("diaChi"), rs.getBoolean("gioiTinh"));
                    listSinhVien.add(sinhVien);
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                DBConnect.close(rs, pst, conn);
            }
        }
        return listSinhVien;
    }

    @Override
    public boolean save(SinhVien sinhVien) {
        boolean result = false;
        String sql = "insert into sinhvien(ma,ten,diaChi,gioiTinh) values(?,?,?,?)";
        PreparedStatement pst = null;
        Connection conn = new DBConnect().connect();
        if (conn != null) {
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, sinhVien.getMa());
                pst.setString(2, sinhVien.getTen());
                pst.setString(3, sinhVien.getDiachi());
                pst.setBoolean(4, sinhVien.isGioiTinh());
                result = pst.executeUpdate() >= 0 ? true : false;
            } catch (Exception e) {
                DBConnect.close(null, pst, conn);
            }
        }
        return result;
    }

    @Override
    public boolean update(SinhVien sinhVien) {
        boolean result = false;
        String sql = "update sinhvien set ten=?, diaChi=?, gioiTinh=? where ma=?";
        PreparedStatement pst = null;
        Connection conn = new DBConnect().connect();
        if (conn != null) {
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, sinhVien.getTen());
                pst.setString(2, sinhVien.getDiachi());
                pst.setBoolean(3, sinhVien.isGioiTinh());
                pst.setString(4, sinhVien.getMa());
                result = pst.executeUpdate() >= 0 ? true : false;
            } catch (Exception e) {
                DBConnect.close(null, pst, conn);
            }
        }
        return result;
    }

    @Override
    public boolean delete(SinhVien sinhVien) {
        boolean result = false;
        String sql = "delete from sinhvien where ma=?";
        PreparedStatement pst = null;
        Connection conn = new DBConnect().connect();
        if (conn != null) {
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, sinhVien.getMa());
                result = pst.executeUpdate() >= 0 ? true : false;
                System.out.println("Result: " + result);
            } catch (Exception e) {
                DBConnect.close(null, pst, conn);
            }
        }
        return result;
    }

    @Override
    public boolean checkID(String ma) {
        boolean result = false;
        String sql = "select *from sinhvien where ma=?";
        PreparedStatement pst = null;
        ResultSet rs = null;
        Connection conn = new DBConnect().connect();
        if (conn != null) {
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, ma);
                rs = pst.executeQuery();
                if (rs.next()) {
                    result = true;
                }
                System.out.println("Result: " + result);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                DBConnect.close(rs, pst, conn);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SinhVien sinhVien = new SinhVien("aaaa", "Vuong", "GN", true);
//        System.out.println(new SinhVienDAO().update(sinhVien));
//        System.out.println(new SinhVienDAO().save(sinhVien));
        System.out.println(new SinhVienDAO().checkID(sinhVien.getMa()));
//        System.out.println(new SinhVienDAO().delete(sinhVien));
    }
}
