package client;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.SinhVien;
import model.SinhVienData;

public class ClientMain {

    private Socket socket = null;

    private ObjectInputStream ois = null;

    private ObjectOutputStream oos = null;

    public ClientMain() {
        try {
            socket = new Socket("localhost", 6969);
            System.out.println("Ket Noi Thanh Cong Den Server");
        } catch (Exception ex) {
            Logger.getLogger(ClientMain.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    public List<SinhVien> getAll() {
        List<SinhVien> listSinhVien = new ArrayList<>();
        try {
            SinhVienData sinhVienDataGui = new SinhVienData("getAll", null);
            sendData(sinhVienDataGui);
            SinhVienData sinhVienDataNhan = receviveData();
            listSinhVien = (List<SinhVien>) sinhVienDataNhan.getData();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }

        return listSinhVien;
    }

    public boolean save(SinhVien sinhVien) {
        boolean result = false;
        try {
            SinhVienData sinhVienDataGui = new SinhVienData("save", sinhVien);
            sendData(sinhVienDataGui);
            SinhVienData sinhVienDataNhan = receviveData();
            result = sinhVienDataNhan.isResult();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return result;
    }

    public boolean findByID(String ma) {
        boolean result = false;
        try {
            SinhVienData sinhVienDataGui = new SinhVienData("findByID", new SinhVien(ma, null, null, false));
            sendData(sinhVienDataGui);
            SinhVienData sinhVienDataNhan = receviveData();
            result = sinhVienDataNhan.isResult();
        } catch (Exception ex) {
            Logger.getLogger(ClientMain.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            close();
        }
        return result;
    }

    public boolean update(SinhVien sinhVien) {
        boolean result = false;
        try {
            SinhVienData sinhVienDataGui = new SinhVienData("update", sinhVien);
            sendData(sinhVienDataGui);
            SinhVienData sinhVienDataNhan = receviveData();
            result = sinhVienDataNhan.isResult();
        } catch (Exception e) {
        } finally {
            close();
        }
        return result;
    }

    public boolean delete(SinhVien sinhVien) {
        boolean result = false;
        try {
            SinhVienData sinhVienDataGui = new SinhVienData("delete", sinhVien);
            sendData(sinhVienDataGui);
            SinhVienData sinhVienDataNhan = receviveData();
            result = sinhVienDataNhan.isResult();
        } catch (Exception e) {
        }
        return result;
    }
}
