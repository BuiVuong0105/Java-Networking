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

    public List<SinhVien> getAll();

    public int save(SinhVien sinhVien);

    public int update(SinhVien sinhVien);

    public int delete(SinhVien sinhVien);

    public SinhVien findByID(String ma);
}
