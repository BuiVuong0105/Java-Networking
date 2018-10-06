/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.SinhVien;
import server.ServerMain;

/**
 *
 * @author Asus
 */
public class ClientFrm extends javax.swing.JFrame {

    private ClientMain clientMain = new ClientMain();
    private List<SinhVien> listSinhVien = new ArrayList<>();
    private DefaultTableModel defaultTableModel;

    public ClientFrm() {
        initComponents();
        defaultTableModel = (DefaultTableModel) tbSinhVien.getModel();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSinhVien = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfMa = new javax.swing.JTextField();
        tfTen = new javax.swing.JTextField();
        tfDiaChi = new javax.swing.JTextField();
        rbNam = new javax.swing.JRadioButton();
        rbNu = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbSinhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã", "Tên", "Địa Chỉ", "Giới Tính"
            }
        ));
        tbSinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSinhVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbSinhVien);

        jLabel1.setText("Mã:");

        jLabel2.setText("Tên:");

        jLabel3.setText("Địa Chỉ:");

        jLabel4.setText("Giới Tính:");

        buttonGroup1.add(rbNam);
        rbNam.setText("Nam");

        buttonGroup1.add(rbNu);
        rbNu.setText("Nữ");

        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Sửa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Xóa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfMa, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTen, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(rbNam)
                        .addGap(18, 18, 18)
                        .addComponent(rbNu))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jButton1)
                        .addGap(32, 32, 32)
                        .addComponent(jButton2)
                        .addGap(29, 29, 29)
                        .addComponent(jButton3)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rbNam)
                    .addComponent(rbNu))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String ma = tfMa.getText();
        String ten = tfTen.getText();
        String diaChi = tfDiaChi.getText();
        if (ma.isEmpty() || ten.isEmpty() || diaChi.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Bạn Chưa Nhập Đủ Dữ Liệu");
            return;
        }
        boolean gioiTinh = rbNam.isSelected() ? true : false;
        SinhVien sinhVien = new SinhVien(ma, ten, diaChi, gioiTinh);

        SinhVien svCheck = new SinhVien();

        try {
            svCheck = clientMain.findByID(ma);
        } catch (RemoteException ex) {
            Logger.getLogger(ClientFrm.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (svCheck != null) {
            JOptionPane.showMessageDialog(this, "Sinh Vien Da Ton Tai");
            return;
        }

        int index = -1;
        try {
            index = clientMain.save(sinhVien);
        } catch (RemoteException ex) {
            Logger.getLogger(ClientFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (index >= 0) {
            JOptionPane.showMessageDialog(this, "Save Thanh Công");
            init();
            return;
        } else {
            JOptionPane.showMessageDialog(this, "Lưu Thất bại");
            return;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int indexXoa = tbSinhVien.getSelectedRow();
        if (indexXoa < 0) {
            JOptionPane.showMessageDialog(this, "Mời Bạn Chọn Một Hàng Trướng Khi Xóa");
            return;
        }
        SinhVien sinhVien = listSinhVien.get(indexXoa);
        int index = -1;
        try {
            index = clientMain.delete(sinhVien);
        } catch (RemoteException ex) {
            Logger.getLogger(ClientFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (index >= 0) {
            JOptionPane.showMessageDialog(this, "Delete Thanh Công");
            init();
            return;
        } else {
            JOptionPane.showMessageDialog(this, "Delete Thất bại");
            return;
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int select = tbSinhVien.getSelectedRow();
        if (select < 0) {
            JOptionPane.showMessageDialog(this, "Mời Bạn Chọn Một Hàng");
            return;
        }

        String ma = tfMa.getText();
        String ten = tfTen.getText();
        String diaChi = tfDiaChi.getText();
        if (ma.isEmpty() || ten.isEmpty() || diaChi.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Bạn Chưa Nhập Đủ Dữ Liệu");
            return;
        }
        boolean gioiTinh = rbNam.isSelected() ? true : false;
        SinhVien sinhVien = new SinhVien(ma, ten, diaChi, gioiTinh);
        int index = -1;
        try {
            index = clientMain.update(sinhVien);
        } catch (RemoteException ex) {
            Logger.getLogger(ClientFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (index >= 0) {
            JOptionPane.showMessageDialog(this, "Update Thanh Công");
            init();
            return;
        } else {
            JOptionPane.showMessageDialog(this, "Update Thất bại");
            return;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tbSinhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSinhVienMouseClicked
        // TODO add your handling code here:
        int select = tbSinhVien.getSelectedRow();
        if (select >= 0) {
            tfMa.setText((String) tbSinhVien.getModel().getValueAt(select, 0));
            tfTen.setText((String) tbSinhVien.getModel().getValueAt(select, 1));
            tfDiaChi.setText((String) tbSinhVien.getModel().getValueAt(select, 2));
            String gt = (String) tbSinhVien.getModel().getValueAt(select, 3);
            if ("Nam".equals(gt)) {
                rbNam.setSelected(true);
            } else {
                rbNu.setSelected(true);
            }
        }
    }//GEN-LAST:event_tbSinhVienMouseClicked

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClientFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbNam;
    private javax.swing.JRadioButton rbNu;
    private javax.swing.JTable tbSinhVien;
    private javax.swing.JTextField tfDiaChi;
    private javax.swing.JTextField tfMa;
    private javax.swing.JTextField tfTen;
    // End of variables declaration//GEN-END:variables

    private void init() {
        try {
            listSinhVien = clientMain.getAll();
        } catch (RemoteException ex) {
            Logger.getLogger(ClientFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        defaultTableModel.setRowCount(0);
        for (SinhVien sinhVien : listSinhVien) {
            defaultTableModel.addRow(sinhVien.toObject());
        }
    }
}
