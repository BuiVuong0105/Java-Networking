/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import model.SinhVien;
import model.SinhVienData;

/**
 *
 * @author Asus
 */
public class ClientSinhVien {

    private DatagramSocket datagramSocket = null;

    public ClientSinhVien() {
        try {
            datagramSocket = new DatagramSocket(1028);
            System.out.println("Da Mo Cong");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public SinhVienData execute(SinhVienData sinhVienDataGui) {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        SinhVienData sinhVienData = new SinhVienData();
        try {
            InetAddress inetAddress = InetAddress.getByName("localhost");
            byte[] dataGui = new byte[10000];
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(sinhVienDataGui);
            oos.flush();
            dataGui = bos.toByteArray();
            DatagramPacket datagramPacketGui = new DatagramPacket(dataGui, dataGui.length, inetAddress, 1024);
            datagramSocket.send(datagramPacketGui);

            byte[] dataNhan = new byte[10000];
            DatagramPacket datagramPacketNhan = new DatagramPacket(dataNhan, dataNhan.length);
            datagramSocket.receive(datagramPacketNhan);
            sinhVienData = (SinhVienData) new ObjectInputStream(new ByteArrayInputStream(dataNhan)).readObject();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bos != null) {
                try {
                    bos.close();
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
        }

        return sinhVienData;
    }

    public List<SinhVien> getAll() {
        System.out.println("Client GetAll");
        List<SinhVien> listSinhVien = new ArrayList<>();
        SinhVienData sinhVienDataGui = new SinhVienData(null, "getAll", false);
        SinhVienData sinhVienDataNhan = execute(sinhVienDataGui);
        listSinhVien = (List<SinhVien>) sinhVienDataNhan.getData();
        return listSinhVien;
    }

    public boolean save(SinhVien sinhVien) {
        System.out.println("Client Save");
        boolean result = false;
        SinhVienData sinhVienDataGui = new SinhVienData(sinhVien, "save", false);
        SinhVienData sinhVienDataNhan = execute(sinhVienDataGui);
        result = sinhVienDataNhan.isResult();
        return result;
    }

    public boolean checkID(SinhVien sinhVien) {
        System.out.println("Client CheckID");
        boolean result = false;
        SinhVienData sinhVienDataGui = new SinhVienData(sinhVien, "checkID", false);
        SinhVienData sinhVienDataNhan = execute(sinhVienDataGui);
        result = sinhVienDataNhan.isResult();
        return result;
    }

    public boolean update(SinhVien sinhVien) {
        System.out.println("Client Update");
        boolean result = false;
        SinhVienData sinhVienDataGui = new SinhVienData(sinhVien, "update", false);
        SinhVienData sinhVienDataNhan = execute(sinhVienDataGui);
        result = sinhVienDataNhan.isResult();
        return result;
    }

    public boolean delete(SinhVien sinhVien) {
        System.out.println("Client Delete");
        boolean result = false;
        SinhVienData sinhVienDataGui = new SinhVienData(sinhVien, "delete", false);
        SinhVienData sinhVienDataNhan = execute(sinhVienDataGui);
        result = sinhVienDataNhan.isResult();
        return result;
    }
}
