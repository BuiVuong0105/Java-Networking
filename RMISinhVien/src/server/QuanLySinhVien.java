/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import controller.ISinhVienDAO;
import controller.SinhVienDAO;
import interfaces.IQuanLySinhVien;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.SinhVien;

/**
 *
 * @author Asus
 */
public class QuanLySinhVien extends UnicastRemoteObject implements IQuanLySinhVien {

    private ISinhVienDAO sinhVienDAO;

    public QuanLySinhVien() throws RemoteException {
        sinhVienDAO = new SinhVienDAO();
    }

    @Override
    public List<SinhVien> getAll() throws RemoteException {
        return sinhVienDAO.getAll();
    }

    @Override
    public int save(SinhVien sinhVien) throws RemoteException {
        return sinhVienDAO.save(sinhVien);
    }

    @Override
    public int update(SinhVien sinhVien) throws RemoteException {
        return sinhVienDAO.update(sinhVien);
    }

    @Override
    public int delete(SinhVien sinhVien) throws RemoteException {
        return sinhVienDAO.delete(sinhVien);
    }

    @Override
    public SinhVien findByID(String ma) throws RemoteException {
        return sinhVienDAO.findByID(ma);
    }

}
