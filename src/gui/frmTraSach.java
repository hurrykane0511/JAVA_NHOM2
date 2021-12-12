/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import bll.BLL_TraSachh;
import et.ET_TraSachh;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dthan
 */
public class frmTraSach extends javax.swing.JFrame {
    
    private BLL_TraSachh bll;
    HashMap<String, String> hm_nv = new HashMap<String, String>();
    
    public frmTraSach() throws Exception {
        initComponents();
        this.setLocationRelativeTo(null);
        bll = new BLL_TraSachh();
        
        hienThi();
        hienThiTraSach();
        
        txtMaSach.setEditable(false);
        txtSoNgayQuaHan.setEditable(false);
        dtpNgayThucTra.setEnabled(false);
        dtpNgayDuKienTra.setEnabled(false);
        txtDocGia.setEditable(false);
        txtMaTheThuVien.setEditable(false);
        txtTienPhat.setEditable(false);

        // lấy ngày hiện tại 
        Date date = new Date();
        dtpNgayThucTra.setDate(date);
        
        this.bll = new BLL_TraSachh();
        this.hm_nv = bll.hm_NV();
        loadCBNV();
        
    }
    
    public void loadCBNV() {
        
        cbbNhanVien.removeAllItems();
        Map<String, String> map = new TreeMap<>(hm_nv);
        
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Object value = entry.getValue();
            cbbNhanVien.addItem(value.toString());
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSoNgayQuaHan = new javax.swing.JTextField();
        txtMaMuonSach = new javax.swing.JTextField();
        btnLuu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTraSach = new javax.swing.JTable();
        btnThoat = new javax.swing.JButton();
        dtpNgayThucTra = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaTinhTrangSach = new javax.swing.JTextArea();
        txtMaSach = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        dtpNgayDuKienTra = new com.toedter.calendar.JDateChooser();
        txtDocGia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtMaTheThuVien = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtTienPhat = new javax.swing.JTextField();
        cbbNhanVien = new javax.swing.JComboBox<>();
        btnMoi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(155, 177, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(84, 101, 225));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("TRẢ SÁCH");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(520, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(450, 450, 450))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Mã mượn sách");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 124, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Ngày thực trả");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 244, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Mã sách");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 313, -1, 23));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Nhân viên");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, 28));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Số ngày quá hạn");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 238, -1, -1));

        txtSoNgayQuaHan.setMinimumSize(new java.awt.Dimension(7, 28));
        txtSoNgayQuaHan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoNgayQuaHanActionPerformed(evt);
            }
        });
        jPanel1.add(txtSoNgayQuaHan, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 238, 100, 28));

        txtMaMuonSach.setMinimumSize(new java.awt.Dimension(7, 28));
        txtMaMuonSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaMuonSachActionPerformed(evt);
            }
        });
        jPanel1.add(txtMaMuonSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 117, 170, 28));

        btnLuu.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_add_26px.png"))); // NOI18N
        btnLuu.setText("LƯU");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });
        jPanel1.add(btnLuu, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 478, -1, 32));

        tblTraSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblTraSach);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 534, 1070, 280));

        btnThoat.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_shutdown_26px.png"))); // NOI18N
        btnThoat.setText("THOÁT");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        jPanel1.add(btnThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 478, -1, 32));
        jPanel1.add(dtpNgayThucTra, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 236, 170, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Tình trạng sách");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 378, -1, -1));

        txtaTinhTrangSach.setColumns(20);
        txtaTinhTrangSach.setRows(5);
        jScrollPane2.setViewportView(txtaTinhTrangSach);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(766, 375, -1, -1));

        txtMaSach.setMinimumSize(new java.awt.Dimension(7, 28));
        txtMaSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaSachActionPerformed(evt);
            }
        });
        jPanel1.add(txtMaSach, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 308, 170, 28));

        btnTim.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_search_26px.png"))); // NOI18N
        btnTim.setText("Tìm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });
        jPanel1.add(btnTim, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 115, -1, 28));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Ngày dự trả");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 186, -1, -1));
        jPanel1.add(dtpNgayDuKienTra, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 178, 170, 30));

        txtDocGia.setMinimumSize(new java.awt.Dimension(7, 28));
        txtDocGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocGiaActionPerformed(evt);
            }
        });
        jPanel1.add(txtDocGia, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 110, 170, 28));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Tên đọc giả");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, -1, 28));

        txtMaTheThuVien.setMinimumSize(new java.awt.Dimension(7, 28));
        txtMaTheThuVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaTheThuVienActionPerformed(evt);
            }
        });
        jPanel1.add(txtMaTheThuVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 170, 100, 28));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Mã thẻ thư viện");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, -1, 23));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Tiền phạt");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 308, -1, -1));

        txtTienPhat.setMinimumSize(new java.awt.Dimension(7, 28));
        txtTienPhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTienPhatActionPerformed(evt);
            }
        });
        jPanel1.add(txtTienPhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(769, 308, 100, 28));

        cbbNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbNhanVienActionPerformed(evt);
            }
        });
        jPanel1.add(cbbNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 170, 28));

        btnMoi.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_new_26px_4.png"))); // NOI18N
        btnMoi.setText("MỚI");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });
        jPanel1.add(btnMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 478, 100, 32));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDocGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocGiaActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        //String a = ((JTextField)dtpNgayTraSach.getDateEditor().getUiComponent()).getText();
        //String b = ((JTextField)dtpNgayMuonSach.getDateEditor().getUiComponent()).getText();       
        //txtNhanVien.setText(a);     
        try {
            ResultSet rs = bll.timTraSach(txtMaMuonSach.getText());
            if (rs.next() == false) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy mã mượn sách");
                txtMaMuonSach.setText("");
                
                txtMaSach.setText("");
                txtDocGia.setText("");
                txtaTinhTrangSach.setText("");
                txtMaTheThuVien.setText("");
                txtSoNgayQuaHan.setText("");
                txtTienPhat.setText("");
                dtpNgayDuKienTra.setDate(null);
                
            } else {
                txtMaMuonSach.setText(rs.getString("id_rental_detail"));
                dtpNgayDuKienTra.setDate(rs.getDate("return_date"));
                txtMaSach.setText(rs.getString("id_book"));
                txtMaTheThuVien.setText(rs.getString("id_lib_card"));
                
                try {
                    String rs1 = bll.layTenDocGia(txtMaTheThuVien.getText());
                    txtDocGia.setText(rs1);
                } catch (Exception ex) {
                    Logger.getLogger(frmTraSach.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                txtaTinhTrangSach.setText(rs.getString("status"));
            }
        } catch (Exception e) {
            
        }
        soNgayQuaHan();
        tienPhat();

    }//GEN-LAST:event_btnTimActionPerformed

    private void txtMaSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaSachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaSachActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        int kq = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát không", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (kq == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        String maMuon = txtMaMuonSach.getText();
        java.sql.Date ngayDuTra = new java.sql.Date(dtpNgayDuKienTra.getDate().getTime());
        java.sql.Date ngayThucTra = new java.sql.Date(dtpNgayThucTra.getDate().getTime());
        String maSach = txtMaSach.getText();
        String tenDocGia = txtDocGia.getText();
        String maThuVien = txtMaTheThuVien.getText();
        String soNgayQuaHan = txtSoNgayQuaHan.getText();
        String tienPhat = txtTienPhat.getText();
        String maNhanVien = getMaNV();
        String tinhTrangSach = txtaTinhTrangSach.getText();
        //ET_TraSachh et = new ET_TraSachh(maMuon, ngayDuTra, ngayThucTra, maSach, tenDocGia, maThuVien, soNgayQuaHan, tienPhat, maNhanVien, tinhTrangSach);
        ET_TraSachh et = new ET_TraSachh(Integer.parseInt(maMuon), ngayDuTra, ngayThucTra, maSach, tenDocGia, maThuVien, Integer.parseInt(soNgayQuaHan), Integer.parseInt(tienPhat), maNhanVien, tinhTrangSach);
        
        try {
            if (bll.themTraSach(et)) {
                JOptionPane.showMessageDialog(rootPane, "Thêm thành công");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Thêm không thành công");
        }
        try {
            hienThiTraSach();
        } catch (SQLException ex) {
            Logger.getLogger(frmTraSach.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLuuActionPerformed
    public String getMaNV() {
        for (Map.Entry<String, String> entry : hm_nv.entrySet()) {
            if (entry.getValue().equals(cbbNhanVien.getSelectedItem())) {
                return entry.getKey();
            }
        }
        return "";
    }

    private void txtMaMuonSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaMuonSachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaMuonSachActionPerformed

    private void txtSoNgayQuaHanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoNgayQuaHanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoNgayQuaHanActionPerformed

    private void txtMaTheThuVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaTheThuVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaTheThuVienActionPerformed

    private void txtTienPhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTienPhatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTienPhatActionPerformed

    private void cbbNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbNhanVienActionPerformed
        

    }//GEN-LAST:event_cbbNhanVienActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        

    }//GEN-LAST:event_btnMoiActionPerformed
//    public void comboboxMaSach() throws Exception {
//        bll = new BLL_TraSach();
//        cbbMaSach.removeAllItems();
//        ResultSet rs = bll.cbbGetMaSach();
//        while (rs.next()) {
//            cbbMaSach.addItem(rs.getString("id_book"));
//        }
//    }

//    public void comboboxMaNhanVien() throws Exception {
//        bll = new BLL_TraSach();
//        cbbMaNhanVien.removeAllItems();
//        ResultSet rs = bll.cbbGetMaNV();
//        while (rs.next()) {
//            cbbMaNhanVien.addItem(rs.getString("id_staff"));
//        }
//    }
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
            java.util.logging.Logger.getLogger(frmTraSach.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTraSach.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTraSach.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
            
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTraSach.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                    new frmTraSach().setVisible(true);
                    
                } catch (Exception ex) {
                    Logger.getLogger(frmTraSach.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    public void hienThi() {
        DefaultTableModel model = (DefaultTableModel) tblTraSach.getModel();
        model.setColumnCount(0);
        model.setRowCount(0);
        model.addColumn("Mã trả sách");
        model.addColumn("Mã mượn sách");
        model.addColumn("Ngày dự trả");
        model.addColumn("Ngày thực trả");
        model.addColumn("Mã sách");
        model.addColumn("Tên đọc giả");
        model.addColumn("Mã thẻ thư viện");
        model.addColumn("Số ngày quá hạn");
        model.addColumn("Tiền phạt");
        model.addColumn("Mã nhân viên");
        model.addColumn("Tình trạng sách");
        tblTraSach.setModel(model);
    }
    
    public void hienThiTraSach() throws SQLException {
        
        DefaultTableModel model = (DefaultTableModel) tblTraSach.getModel();
        model.setRowCount(0);
        ResultSet rs = bll.layTraSach();
        
        while (rs.next()) {
            Object[] col = new Object[11];
            for (int i = 1; i <= 11; i++) {
                col[i - 1] = rs.getObject(i);
            }
            model.addRow(col);
        }
    }
    
    public void soNgayQuaHan() {
        SimpleDateFormat fr = new SimpleDateFormat("yyyy-MM-dd");
        Date ngayMuon = null;
        Date ngayTra = null;
        
        try {
            ngayTra = fr.parse(fr.format(dtpNgayThucTra.getDate()));
            ngayMuon = fr.parse(fr.format(dtpNgayDuKienTra.getDate()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        long datediff = ngayTra.getTime() - ngayMuon.getTime();
        long days = datediff / (60 * 60 * 1000) / 24;
        txtSoNgayQuaHan.setText(Long.toString(days));
        if (days < 0) {
            txtSoNgayQuaHan.setText("0");
        }
    }
    
    public void tienPhat() {
        int tienPhat = Integer.parseInt(txtSoNgayQuaHan.getText()) * 10000;
        txtTienPhat.setText(Integer.toString(tienPhat));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTim;
    private javax.swing.JComboBox<String> cbbNhanVien;
    private com.toedter.calendar.JDateChooser dtpNgayDuKienTra;
    private com.toedter.calendar.JDateChooser dtpNgayThucTra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTraSach;
    private javax.swing.JTextField txtDocGia;
    private javax.swing.JTextField txtMaMuonSach;
    private javax.swing.JTextField txtMaSach;
    private javax.swing.JTextField txtMaTheThuVien;
    private javax.swing.JTextField txtSoNgayQuaHan;
    private javax.swing.JTextField txtTienPhat;
    private javax.swing.JTextArea txtaTinhTrangSach;
    // End of variables declaration//GEN-END:variables
}
