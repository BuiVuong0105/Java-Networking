/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.SinhVien;

/**
 *
 * @author Asus
 */
public class ClientView extends javax.swing.JFrame {

    private DefaultTableModel defaultTableModel;

    private List<SinhVien> listSinhVien = new ArrayList<>();

    public ClientView() {
        initComponents();
        defaultTableModel = (DefaultTableModel) tbSinhVien.getModel();
        init();
    }

    public void init() {
        defaultTableModel.setRowCount(0);
        listSinhVien = new ClientMain().getAll();
        for (SinhVien sinhVien : listSinhVien) {
            defaultTableModel.addRow(sinhVien.toObject());
        }
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
        btAdd = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        rbNam = new javax.swing.JRadioButton();
        rbNu = new javax.swing.JRadioButton();
        tfDiaChi = new javax.swing.JTextField();
        tfTen = new javax.swing.JTextField();
        tfMa = new javax.swing.JTextField();

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

        jLabel3.setText("Đia Chỉ:");

        jLabel4.setText("Giói Tính:");

        btAdd.setText("Thêm");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        jButton1.setText("Sửa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Xóa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbNam);
        rbNam.setText("Nam");

        buttonGroup1.add(rbNu);
        rbNu.setText("Nu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfMa, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTen, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btAdd)
                        .addGap(32, 32, 32)
                        .addComponent(jButton1)
                        .addGap(28, 28, 28)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(rbNam)
                        .addGap(18, 18, 18)
                        .addComponent(rbNu)))
                .addGap(71, 71, 71))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rbNam)
                    .addComponent(rbNu))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAdd)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        // TODO add your handling code here:

        String ma = tfMa.getText().trim();
        String ten = tfTen.getText().trim();
        String diaChi = tfDiaChi.getText().trim();

        if (ma.isEmpty() || ten.isEmpty() || diaChi.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Bạn Chưa Nhap Du Lieu");
            return;
        }
        boolean gioiTinh = rbNam.isSelected() ? true : false;
        SinhVien sinhVien = new SinhVien(ma, ten, diaChi, gioiTinh);
        if (new ClientMain().findByID(ma)) {
            JOptionPane.showMessageDialog(this, "Mã Bị Trùng");
            return;
        }
        if (new ClientMain().save(sinhVien)) {
            JOptionPane.showMessageDialog(this, "Save Thanh Cong");
            init();
            return;
        } else {
            JOptionPane.showMessageDialog(this, "Save That Bai");
            return;
        }
    }//GEN-LAST:event_btAddActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int select = tbSinhVien.getSelectedRow();
        if (select < 0) {
            JOptionPane.showMessageDialog(this, "Bạn Chưa CHon Sinh Vien");
            return;
        }
        SinhVien sinhVien = listSinhVien.get(select);
        if (new ClientMain().delete(sinhVien)) {
            JOptionPane.showMessageDialog(this, "Xoa Thanh Cong");
            init();
            return;
        } else {
            JOptionPane.showMessageDialog(this, "Xoa That Bai");
            return;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tbSinhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSinhVienMouseClicked
        // TODO add your handling code here:
        int select = tbSinhVien.getSelectedRow();
        tfMa.setText((String) tbSinhVien.getModel().getValueAt(select, 0));
        tfTen.setText((String) tbSinhVien.getModel().getValueAt(select, 1));
        tfDiaChi.setText((String) tbSinhVien.getModel().getValueAt(select, 2));
        String gt = (String) tbSinhVien.getModel().getValueAt(select, 3);
        if ("Nam".equals(gt)) {
            rbNam.setSelected(true);
        } else {
            rbNu.setSelected(true);
        }
    }//GEN-LAST:event_tbSinhVienMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int select = tbSinhVien.getSelectedRow();
        if (select < 0) {
            JOptionPane.showMessageDialog(this, "Moi Ban Chon SV Can Sua");
            return;
        }
        String ma = tfMa.getText().trim();
        String ten = tfTen.getText().trim();
        String diaChi = tfDiaChi.getText().trim();
        if (ma.isEmpty() || ten.isEmpty() || diaChi.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Bạn Chưa Nhap Du Lieu");
            return;
        }
        boolean gioiTinh = rbNam.isSelected() ? true : false;
        SinhVien sinhVien = new SinhVien(ma, ten, diaChi, gioiTinh);
        if (new ClientMain().update(sinhVien)) {
            JOptionPane.showMessageDialog(this, "Update Thanh Cong");
            init();
            return;
        } else {
            JOptionPane.showMessageDialog(this, "Update That Bai");
            return;
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
}
