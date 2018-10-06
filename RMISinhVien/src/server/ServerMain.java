/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import interfaces.IQuanLySinhVien;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author Asus
 */
public class ServerMain {

    public static void main(String[] args) {
        try {
            IQuanLySinhVien quanLySinhVien = new QuanLySinhVien();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi://localhost/sinhvien", quanLySinhVien);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
