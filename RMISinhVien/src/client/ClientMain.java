/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import interfaces.IQuanLySinhVien;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.SinhVien;

/**
 *
 * @author Asus
 */
public class ClientMain {

    private IQuanLySinhVien quanLySinhVien;

    public ClientMain() {
        try {
            quanLySinhVien = (IQuanLySinhVien) Naming.lookup("rmi://localhost/sinhvien");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public IQuanLySinhVien getQuanLySinhVien() {
        return quanLySinhVien;
    }

    public void setQuanLySinhVien(IQuanLySinhVien quanLySinhVien) {
        this.quanLySinhVien = quanLySinhVien;
    }

    public List<SinhVien> getAll() throws RemoteException {
        return quanLySinhVien.getAll();
    }

    public int save(SinhVien sinhVien) throws RemoteException {
        return quanLySinhVien.save(sinhVien);
    }

    public int update(SinhVien sinhVien) throws RemoteException {
        return quanLySinhVien.update(sinhVien);
    }

    public int delete(SinhVien sinhVien) throws RemoteException {
        return quanLySinhVien.delete(sinhVien);
    }

    public SinhVien findByID(String ma) throws RemoteException {
        return quanLySinhVien.findByID(ma);
    }
}
