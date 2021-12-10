/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import bll.Bll_CapNhatSach;
import et.ET_Sach;
import bll.BLL_NXB;
import et.ET_NXB;
import bll.BLL_NgonNgu1;
import et.ET_NgonNgu1;
import bll.BLL_TheLoai;
import et.ET_TheLoai;
import bll.BLL_TacGia;
import et.ET_TacGia;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class frmCapNhatSach extends javax.swing.JFrame {

    private Bll_CapNhatSach bll;
    private BLL_NXB bllNXB;
    private BLL_NgonNgu1 bllNN;
    private BLL_TheLoai bllTL;
    private BLL_TacGia bllTG;

    /**
     * Creates new form FormCapNhat
     */
    public frmCapNhatSach() throws SQLException, Exception {
        initComponents();
        this.setLocationRelativeTo(null);

        bll = new Bll_CapNhatSach();
        comboboxNN();
        comboboxNXB();
        comboboxTL();
        comboboxTG();
        hienThi();
        hienThiSach();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTensach = new javax.swing.JTextField();
        txtMasach = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSach = new javax.swing.JTable();
        txtNamXB = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSua = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        cbTheLoai = new javax.swing.JComboBox<>();
        cbNXB = new javax.swing.JComboBox<>();
        cbNgonNgu = new javax.swing.JComboBox<>();
        cbTacGia = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(155, 177, 255));

        jPanel2.setBackground(new java.awt.Color(84, 101, 225));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("CẬP NHẬT SÁCH");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(367, 367, 367)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Năm xuất bản");

        txtTensach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTensachActionPerformed(evt);
            }
        });

        txtMasach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMasachActionPerformed(evt);
            }
        });

        tbSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sách", "Tên sách", "Tình trạng", "Thể loại", "Ngôn ngữ", "Số lượng", "Tác giả", "NXB", "Năm xuất bản", "Vị trí"
            }
        ));
        tbSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbSach);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Thể loại sách");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Ngôn ngữ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Mã sách");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Tác giả");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Tên sách");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Tên NXB");

        btnSua.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_edit_26px.png"))); // NOI18N
        btnSua.setText("SỬA");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnThoat.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_shutdown_26px.png"))); // NOI18N
        btnThoat.setText("THOÁT");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTensach, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(30, 30, 30)
                                    .addComponent(txtMasach, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(cbNgonNgu, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(179, 179, 179)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(btnThoat))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNamXB, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(cbNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 893, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtMasach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(cbTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtTensach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(cbNXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(106, 106, 106))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtNamXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(cbTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbNgonNgu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua)
                    .addComponent(btnThoat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
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

    private void txtTensachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTensachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTensachActionPerformed

    private void txtMasachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMasachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMasachActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        int row = tbSach.getSelectedRow();
        if (row >= 0) {
        String maSach = tbSach.getValueAt(row, 0).toString();
        JOptionPane.showMessageDialog(null, maSach);
        String tenSach = txtTensach.getText();
        String theLoai = null;
        try {
            theLoai = bllTL.layMa(cbTheLoai.getSelectedItem().toString());
        } catch (Exception ex) {
            Logger.getLogger(frmCapNhatSach.class.getName()).log(Level.SEVERE, null, ex);
        }
        String ngonNgu = null;
        try {
            ngonNgu = bllNN.layMa(cbNgonNgu.getSelectedItem().toString());
        } catch (Exception ex) {
            Logger.getLogger(frmCapNhatSach.class.getName()).log(Level.SEVERE, null, ex);
        }
        String tacGia = null;
        try {
            tacGia = bllTG.layMa(cbTacGia.getSelectedItem().toString());
        } catch (Exception ex) {
            Logger.getLogger(frmCapNhatSach.class.getName()).log(Level.SEVERE, null, ex);
        }
        String NXB = null;
        try {
            NXB = bllNXB.layMa(cbNXB.getSelectedItem().toString());;
        } catch (Exception ex) {
            Logger.getLogger(frmCapNhatSach.class.getName()).log(Level.SEVERE, null, ex);
        }
        int namXB = Integer.parseInt(txtNamXB.getText());
        
        ET_Sach et;
        if (maSach.compareTo("") == 0
                || tenSach.compareTo("") == 0
                || (txtNamXB.getText()).compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền đầy đủ thông tin");
        } else {
            try {
                et = new ET_Sach(maSach, tenSach, theLoai, ngonNgu, tacGia, NXB, namXB);

                if (bll.suaSach(et)) {
                    JOptionPane.showMessageDialog(rootPane, "Thành công");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Không thành công");
                }
                hienThiSach();

            } catch (SQLException ex) {
                Logger.getLogger(frmNhanVien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }else
        {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn nhân viên");
        }

    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void tbSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSachMouseClicked
        // TODO add your handling code here:
        int row = tbSach.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tbSach.getModel();
        txtMasach.setText(model.getValueAt(row, 0).toString());
        txtTensach.setText(model.getValueAt(row, 1).toString());
        try {
            cbTheLoai.setSelectedItem(bllTL.layTen(model.getValueAt(row, 2).toString()));

        } catch (Exception ex) {
            Logger.getLogger(frmCapNhatSach.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            cbNgonNgu.setSelectedItem(bllNN.layTen(model.getValueAt(row, 3).toString()));
        } catch (Exception ex) {
            Logger.getLogger(frmCapNhatSach.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            cbTacGia.setSelectedItem(bllTG.layTen(model.getValueAt(row, 4).toString()));
        } catch (Exception ex) {
            Logger.getLogger(frmCapNhatSach.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            cbNXB.setSelectedItem(bllNXB.layTen(model.getValueAt(row, 5).toString()));
        } catch (Exception ex) {
            Logger.getLogger(frmCapNhatSach.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtNamXB.setText(model.getValueAt(row, 6).toString());
    }//GEN-LAST:event_tbSachMouseClicked
    public void comboboxNXB() throws Exception {
        bllNXB = new BLL_NXB();
        cbNXB.removeAllItems();
        ResultSet rs = bllNXB.layDS();
        while (rs.next()) {
            cbNXB.addItem(rs.getString("name"));
        }
    }

    public void comboboxNN() throws Exception {
        bllNN = new BLL_NgonNgu1();
        cbNgonNgu.removeAllItems();
        ResultSet rs = bllNN.layDS();
        while (rs.next()) {
            cbNgonNgu.addItem(rs.getString("title"));
        }
    }

    public void comboboxTL() throws Exception {
        bllTL = new BLL_TheLoai();
        cbTheLoai.removeAllItems();
        ResultSet rs = bllTL.layDS();
        while (rs.next()) {
            cbTheLoai.addItem(rs.getString("title"));
        }
    }

    public void comboboxTG() throws Exception {
        bllTG = new BLL_TacGia();
        cbTacGia.removeAllItems();
        ResultSet rs = bllTG.layDS();
        while (rs.next()) {
            cbTacGia.addItem(rs.getString("author_name"));
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(frmCapNhatSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCapNhatSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCapNhatSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCapNhatSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new frmCapNhatSach().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(frmNhanVien.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public void hienThi() {
        DefaultTableModel model = (DefaultTableModel) tbSach.getModel();
        model.setColumnCount(0);
        model.setRowCount(0);
        model.addColumn("Mã Sách");
        model.addColumn("Tên Sách");
        model.addColumn("Thể loại");
        model.addColumn("Ngôn ngữ");
        model.addColumn("Tác giả");
        model.addColumn("Nhà xuất bản");
        model.addColumn("Năm xuất bản");
        tbSach.setModel(model);
    }

    public void hienThiSach() throws SQLException {
        ResultSet rs = bll.layDSSach();
        DefaultTableModel model = (DefaultTableModel) tbSach.getModel();
        model.setRowCount(0);
        while (rs.next()) {
            Object[] col = new Object[7];
            for (int i = 1; i <= 7; i++) {
                col[i - 1] = rs.getObject(i);
            }
            model.addRow(col);
        }
        // rs.close();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThoat;
    private javax.swing.JComboBox<String> cbNXB;
    private javax.swing.JComboBox<String> cbNgonNgu;
    private javax.swing.JComboBox<String> cbTacGia;
    private javax.swing.JComboBox<String> cbTheLoai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbSach;
    private javax.swing.JTextField txtMasach;
    private javax.swing.JTextField txtNamXB;
    private javax.swing.JTextField txtTensach;
    // End of variables declaration//GEN-END:variables
}
