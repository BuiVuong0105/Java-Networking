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

public class SinhVienView extends javax.swing.JFrame {

    private DefaultTableModel defaultTableModel;

    private List<SinhVien> listSinhVien = new ArrayList<>();

    ClientSinhVien clientSinhVien = new ClientSinhVien();

    public SinhVienView() {
        initComponents();
        defaultTableModel = (DefaultTableModel) tbSinhVien.getModel();
        init();
    }

    public void init() {
        defaultTableModel.setRowCount(0);
        listSinhVien = clientSinhVien.getAll();
        for (SinhVien sinhVien : listSinhVien) {
            defaultTableModel.addRow(sinhVien.toObject());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSinhVien = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tfMa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfTen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfDiaChi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
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
                "Ma", "Ten", "DiaChi", "GioiTinh"
            }
        ));
        tbSinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSinhVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbSinhVien);

        jLabel1.setText("Ma:");

        jLabel2.setText("Ten");

        jLabel3.setText("Dia Chi");

        jLabel4.setText("Gioi Tinh");

        buttonGroup1.add(rbNam);
        rbNam.setText("Nam");
        rbNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNamActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbNu);
        rbNu.setText("Nu");

        jButton1.setText("Them");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Sua");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Xoa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfMa, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTen, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rbNam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbNu))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jButton1)
                                .addGap(34, 34, 34)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(198, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rbNam)
                    .addComponent(rbNu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNamActionPerformed
    }//GEN-LAST:event_rbNamActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String ma = tfMa.getText().trim();
        String ten = tfTen.getText().trim();
        String diaChi = tfDiaChi.getText().trim();

        if (ma.isEmpty() || ten.isEmpty() || diaChi.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ban Chua Nhap Du Du Lieu");
            return;
        }

        boolean gioiTinh = rbNam.isSelected() ? true : false;
        SinhVien sinhVien = new SinhVien(ma, ten, diaChi, gioiTinh);
        if (clientSinhVien.checkID(sinhVien)) {
            JOptionPane.showMessageDialog(null, "SV Da Ton Tai");
            return;
        }
        if (clientSinhVien.save(sinhVien)) {
            JOptionPane.showMessageDialog(null, "Them Thanh Cong");
            init();
            return;
        } else {
            JOptionPane.showMessageDialog(null, "Them That Bai");
            return;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int select = tbSinhVien.getSelectedRow();
        if (select < 0) {
            JOptionPane.showMessageDialog(null, "Moi Ban Chon 1 Hang");
            return;
        }
        String ma = tfMa.getText().trim();
        String ten = tfTen.getText().trim();
        String diaChi = tfDiaChi.getText().trim();

        if (ma.isEmpty() || ten.isEmpty() || diaChi.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ban Chua Nhap Du Du Lieu");
            return;
        }

        boolean gioiTinh = rbNam.isSelected() ? true : false;
        SinhVien sinhVien = new SinhVien(ma, ten, diaChi, gioiTinh);
        if (clientSinhVien.update(sinhVien)) {
            JOptionPane.showMessageDialog(null, "Sua Thanh Cong");
            init();
            return;
        } else {
            JOptionPane.showMessageDialog(null, "Sua That Bai");
            return;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tbSinhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSinhVienMouseClicked
        // TODO add your handling code here:
        int select = tbSinhVien.getSelectedRow();
        tfMa.setText((String) tbSinhVien.getValueAt(select, 0));
        tfTen.setText((String) tbSinhVien.getValueAt(select, 1));
        tfDiaChi.setText((String) tbSinhVien.getValueAt(select, 2));
        String gt = (String) tbSinhVien.getValueAt(select, 3);
        if (gt.equals("Nam")) {
            rbNam.setSelected(true);
        } else {
            rbNu.setSelected(true);
        }
    }//GEN-LAST:event_tbSinhVienMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int select = tbSinhVien.getSelectedRow();
        if (select < 0) {
            JOptionPane.showMessageDialog(null, "Moi Ban Chon 1 Hang");
            return;
        }
        SinhVien sinhVien = listSinhVien.get(select);
        if (clientSinhVien.delete(sinhVien)) {
            JOptionPane.showMessageDialog(null, "delete Thanh Cong");
            init();
            return;
        } else {
            JOptionPane.showMessageDialog(null, "delete That Bai");
            return;
        }
    }//GEN-LAST:event_jButton3ActionPerformed
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
            java.util.logging.Logger.getLogger(SinhVienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SinhVienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SinhVienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SinhVienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SinhVienView().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbNam;
    private javax.swing.JRadioButton rbNu;
    private javax.swing.JTable tbSinhVien;
    private javax.swing.JTextField tfDiaChi;
    private javax.swing.JTextField tfMa;
    private javax.swing.JTextField tfTen;
    // End of variables declaration//GEN-END:variables
}
