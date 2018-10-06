/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.SinhVien;

/**
 *
 * @author Asus
 */
public interface IQuanLySinhVien extends Remote {

    public List<SinhVien> getAll() throws RemoteException;

    public int save(SinhVien sinhVien) throws RemoteException;

    public int update(SinhVien sinhVien) throws RemoteException;

    public int delete(SinhVien sinhVien) throws RemoteException;

    public SinhVien findByID(String ma) throws RemoteException;
}
