/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import controller.ISinhVienDAO;
import controller.SinhVienDAO;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.SinhVien;
import model.SinhVienData;

/**
 *
 * @author Asus
 */
public class ServerThread extends Thread {

    private Socket socket;

    private ISinhVienDAO sinhVienDAO = new SinhVienDAO();

    private ObjectOutputStream oos = null;

    private ObjectInputStream ois = null;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    public void sendData(SinhVienData sinhVienData) {
        try {
            oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(sinhVienData);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public SinhVienData receviveData() {
        SinhVienData sinhVienData = new SinhVienData();
        try {
            ois = new ObjectInputStream(socket.getInputStream());
            sinhVienData = (SinhVienData) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sinhVienData;
    }

    public void close() {
        if (ois != null) {
            try {
                ois.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (oos != null) {
            try {
                oos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (socket != null) {
            try {
                socket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        try {
            SinhVienData sinhVienData = receviveData();
            String action = sinhVienData.getAction();
            switch (action) {
                case "getAll":
                    getAll(sinhVienData);
                    break;
                case "save":
                    save(sinhVienData);
                    break;
                case "findByID":
                    findByID(sinhVienData);
                    break;
                case "delete":
                    delete(sinhVienData);
                    break;
                case "update":
                    update(sinhVienData);
                    break;
            }
        } catch (Exception ex) {
            Logger.getLogger(ServerThread.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
    }

    public void getAll(SinhVienData sinhVienData) {
        System.out.println("Chay Get All");
        List<SinhVien> listSinhVien = sinhVienDAO.getAll();
        sinhVienData.setData(listSinhVien);
        sendData(sinhVienData);
    }

    private void save(SinhVienData sinhVienData) {
        System.out.println("Chay Save Student: ");
        boolean result = sinhVienDAO.save((SinhVien) sinhVienData.getData());
        sinhVienData.setResult(result);
        sendData(sinhVienData);
    }

    private void findByID(SinhVienData sinhVienData) {
        System.out.println("Chay Find ID: ");
        boolean result = sinhVienDAO.findByID(((SinhVien) sinhVienData.getData()).getMa());
        sinhVienData.setResult(result);
        sendData(sinhVienData);
    }

    private void delete(SinhVienData sinhVienData) {
        System.out.println("Chay Delete SinhVien");
        boolean result = sinhVienDAO.delete((SinhVien) sinhVienData.getData());
        sinhVienData.setResult(result);
        sendData(sinhVienData);
    }

    private void update(SinhVienData sinhVienData) {
        System.out.println("Chay Update Student: ");
        boolean result = sinhVienDAO.update((SinhVien) sinhVienData.getData());
        sinhVienData.setResult(result);
        sendData(sinhVienData);
    }
}
