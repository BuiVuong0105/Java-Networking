/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.SinhVien;

/**
 *
 * @author Asus
 */
public interface ISinhVienDAO {

    List<SinhVien> getAll();

    boolean save(SinhVien sinhVien);

    boolean update(SinhVien sinhVien);

    boolean delete(SinhVien sinhVien);

    boolean checkID(String ma);
}
