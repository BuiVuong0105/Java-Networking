/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import controller.SinhVienDAO;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Reader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.List;
import model.SinhVien;
import model.SinhVienData;

/**
 *
 * @author Asus
 */
public class ServerSinhVien {

    private DatagramSocket datagramSocket = null;

    public ServerSinhVien() {
        try {
            datagramSocket = new DatagramSocket(1024);
            System.out.println("Da Mo Cong");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void senData(SinhVienData sinhVienData, InetAddress inetAddress, int port) {
        byte[] dataGui = new byte[10000];
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(sinhVienData);
            oos.flush();
            dataGui = bos.toByteArray();
            DatagramPacket datagramPacketGui = new DatagramPacket(dataGui, dataGui.length, inetAddress, port);
            datagramSocket.send(datagramPacketGui);
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
    }

    public void listen() {
        while (true) {
            try {
                byte[] dataNhan = new byte[10000];
                DatagramPacket datagramPacketNhan = new DatagramPacket(dataNhan, dataNhan.length);
                datagramSocket.receive(datagramPacketNhan);
                SinhVienData sinhVienData = (SinhVienData) new ObjectInputStream(new ByteArrayInputStream(dataNhan)).readObject();
                String action = sinhVienData.getAction();
                switch (action) {
                    case "getAll":
                        getAll(datagramPacketNhan);
                        break;
                    case "save":
                        save(datagramPacketNhan, (SinhVien) sinhVienData.getData());
                        break;
                    case "checkID":
                        checkID(datagramPacketNhan, (SinhVien) sinhVienData.getData());
                        break;
                    case "update":
                        update(datagramPacketNhan, (SinhVien) sinhVienData.getData());
                        break;
                    case "delete":
                        delete(datagramPacketNhan, (SinhVien) sinhVienData.getData());
                        break;
                    default:
                        throw new AssertionError();
                }
            } catch (Exception e) {
            }
        }
    }

    public void getAll(DatagramPacket datagramPacketNhan) {
        System.out.println("Server GetAll");
        InetAddress inetAddress = datagramPacketNhan.getAddress();
        int port = datagramPacketNhan.getPort();
        List<SinhVien> listSinhVien = new SinhVienDAO().getAll();
        SinhVienData sinhVienData = new SinhVienData(listSinhVien, null, true);
        senData(sinhVienData, inetAddress, port);
    }

    public void save(DatagramPacket datagramPacketNhan, SinhVien sinhVien) {
        System.out.println("Server save");
        InetAddress inetAddress = datagramPacketNhan.getAddress();
        int port = datagramPacketNhan.getPort();
        boolean result = new SinhVienDAO().save(sinhVien);
        SinhVienData sinhVienData = new SinhVienData(null, null, result);
        senData(sinhVienData, inetAddress, port);
    }

    public void checkID(DatagramPacket datagramPacketNhan, SinhVien sinhVien) {
        System.out.println("Server Check ID");
        InetAddress inetAddress = datagramPacketNhan.getAddress();
        int port = datagramPacketNhan.getPort();
        boolean result = new SinhVienDAO().checkID(sinhVien.getMa());
        SinhVienData sinhVienData = new SinhVienData(null, null, result);
        senData(sinhVienData, inetAddress, port);
    }

    public void update(DatagramPacket datagramPacketNhan, SinhVien sinhVien) {
        System.out.println("Server update");
        InetAddress inetAddress = datagramPacketNhan.getAddress();
        int port = datagramPacketNhan.getPort();
        boolean result = new SinhVienDAO().update(sinhVien);
        SinhVienData sinhVienData = new SinhVienData(null, null, result);
        senData(sinhVienData, inetAddress, port);
    }

    public void delete(DatagramPacket datagramPacketNhan, SinhVien sinhVien) {
        System.out.println("Server Delete");
        InetAddress inetAddress = datagramPacketNhan.getAddress();
        int port = datagramPacketNhan.getPort();
        boolean result = new SinhVienDAO().delete(sinhVien);
        SinhVienData sinhVienData = new SinhVienData(null, null, result);
        senData(sinhVienData, inetAddress, port);
    }

    public static void main(String[] args) {
        new ServerSinhVien().listen();
    }

}
