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

    public boolean save(SinhVien sinhVien);

    public boolean update(SinhVien sinhVien);

    public boolean delete(SinhVien sinhVien);

    public boolean findByID(String ma);

}
