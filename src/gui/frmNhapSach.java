/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package gui;

import bll.BLL_DanhMuc;
import bll.BLL_NgonNgu;
import bll.BLL_NXB;
import bll.BLL_Sach;
import bll.BLL_TacGia;
import bll.BLL_ChiTietHD;
import bll.BLL_HoaDon;
import bll.BLL_NhaCungCap;
import bll.BLL_NhanVien;
import et.ET_ChiTietHD;
import et.ET_HoaDon;
import et.ET_Sach;
import et.ET_TacGia;
import et.ET_NhanVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author yushu
 */
public class frmNhapSach extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmNhapSach
     */
    private BLL_Sach bll;
    private BLL_DanhMuc bllDM;
    private BLL_NXB bllNXB;
    private BLL_NgonNgu bllNN;
    private BLL_TacGia bllTD;
    private BLL_NhanVien bllNV;
    private BLL_HoaDon bllHD;
    private BLL_NhaCungCap bllNCC;
    private BLL_ChiTietHD bllCTHD;
    private ArrayList<ET_NhanVien> arr_NhanVien = new ArrayList<ET_NhanVien>();
    private int STT = 0;

    public frmNhapSach() throws Exception {
        initComponents();
        bllDM = new BLL_DanhMuc();
        bllNXB = new BLL_NXB();
        bllNN = new BLL_NgonNgu();
        bllTD = new BLL_TacGia();
        bll = new BLL_Sach();
        bllHD = new BLL_HoaDon();
        bllNCC = new BLL_NhaCungCap();
        bllCTHD = new BLL_ChiTietHD();
        bllNV = new BLL_NhanVien();
        AutoCompleteDecorator.decorate(cboDM);
        AutoCompleteDecorator.decorate(cboNN);
        AutoCompleteDecorator.decorate(cboNXB);
        AutoCompleteDecorator.decorate(cboNCC);
        AutoCompleteDecorator.decorate(cboNV);
        txtMaHD.setEditable(false);
        resetMa();
        comboboxDM();
        comboboxNN();
        comboboxNXB();
        comboboxNCC();
        comboboxNV();
        hienThi();
        hienHoaDon();
    }

    public String themTD(String Ten) throws Exception {
        ResultSet rs = bllTD.layDS();
        rs.last();
        int row = rs.getRow();
        if (row == 0) {
            STT = 1;
        } else {
            rs.beforeFirst();
            while (rs.next()) {
                STT = Integer.parseInt(rs.getObject(1).toString().substring(2)) + 1;
            }
        }
        String ma = String.format("%02d", STT);
        String New = ("TG" + ma);
        ET_TacGia TD = new ET_TacGia(New, Ten);
        bllTD.themTD(TD);
        return New;
    }

    public String themCTHH() throws Exception {
        ResultSet rs = bllCTHD.layDS();
        rs.last();
        int row = rs.getRow();
        if (row == 0) {
            STT = 1;
        } else {
            rs.beforeFirst();
            while (rs.next()) {
                STT = Integer.parseInt(rs.getObject(1).toString().substring(2)) + 1;
            }
        }
        String ma = String.format("%02d", STT);
        String New = ("CT" + ma);
        return New;
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
        txtNamXB = new javax.swing.JTextField();
        btnthem = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtMaHD = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTacGia = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTenSach = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDS = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        cboNCC = new javax.swing.JComboBox<>();
        txtSoTrang = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        cboDM = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        txtMaSach = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cboNXB = new javax.swing.JComboBox<>();
        txtGia = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cboNN = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        cboNV = new javax.swing.JComboBox<>();
        btnNew = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(155, 177, 250));

        txtNamXB.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        btnthem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnthem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_add_26px.png"))); // NOI18N
        btnthem.setText("THÊM");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnThoat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_shutdown_26px.png"))); // NOI18N
        btnThoat.setText("THOÁT");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setText("Giá:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setText("Năm xuất bản:");

        txtMaHD.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Tác giả:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Tên NXB:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Số lượng:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("Tên sách:");

        txtTacGia.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(84, 101, 225));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("NHẬP SÁCH");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(408, 408, 408)
                .addComponent(jLabel1)
                .addContainerGap(446, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        txtTenSach.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel15.setText("Mã hoá đơn:");

        txtSoLuong.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        tblDS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblDS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDSMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDS);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel16.setText("Danh Mục:");

        cboNCC.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txtSoTrang.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel17.setText("Số Trang:");

        cboDM.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel18.setText("Mã sách:");

        txtMaSach.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel12.setText("Nhân Viên:");

        cboNXB.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txtGia.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel13.setText("Nhà cung cấp:");

        cboNN.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel14.setText("Ngôn ngữ:");

        cboNV.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        btnNew.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_new_26px_4.png"))); // NOI18N
        btnNew.setText("Nhập Lại");
        btnNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNewMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel18)
                            .addComponent(jLabel8)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboDM, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3)
                            .addComponent(jLabel14)
                            .addComponent(jLabel5))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cboNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel10)
                                .addGap(15, 15, 15)
                                .addComponent(txtNamXB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cboNN, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(cboNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel7))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel12)))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(cboNV, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNew)
                    .addComponent(txtSoTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118)
                .addComponent(btnthem)
                .addGap(107, 107, 107)
                .addComponent(btnThoat))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMaHD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtGia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMaSach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTacGia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTenSach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cboNXB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNamXB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cboDM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cboNN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cboNCC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSoTrang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThoat)
                    .addComponent(btnthem)
                    .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        // TODO add your handling code here:
        String gia = txtGia.getText();
        String ten = txtTenSach.getText();
        String mahd = txtMaHD.getText();
        String maSach = txtMaSach.getText();
        String nxb = txtNamXB.getText();
        String sl = txtSoLuong.getText();
        String st = txtSoTrang.getText();
        String maTD = txtTacGia.getText();
        if (maTD.compareTo("") == 0 || gia.compareTo("") == 0 || ten.compareTo("") == 0 || mahd.compareTo("") == 0 || maSach.compareTo("") == 0 || nxb.compareTo("") == 0 || sl.compareTo("") == 0 || st.compareTo("") == 0) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập đủ thông tin");
        } else {
            try {
                String tenDM = cboDM.getSelectedItem().toString();
                String tenNXB = cboNXB.getSelectedItem().toString();
                String tenNN = cboNN.getSelectedItem().toString();
                String tenNCC = cboNCC.getSelectedItem().toString();
                ET_NhanVien NhanVien = (ET_NhanVien) cboNV.getSelectedItem();
                String maNV = NhanVien.getMaNhanVien();
                String maDM = bllDM.layMa(tenDM);
                String maNXB = bllNXB.layMa(tenNXB);
                String maNN = bllNN.layMa(tenNN);
                String maNCC = bllNCC.layMa(tenNCC);
                if (bllHD.checkTonTai(mahd)) {
                    JOptionPane.showMessageDialog(null, "Mã hoá đơn đã tồn tại");
                } else {
                    if (bllNV.checkTT(maNV)) {
                        if (bllTD.checkTonTai(maTD)) {
                            maTD = bllTD.layMa(maTD);
                        } else {
                            maTD = themTD(txtTacGia.getText());
                        }
                        if (bll.checkTonTai(maSach) == true) {
                            int tong = bll.laySLSach(txtMaSach.getText()) + Integer.parseInt(txtSoLuong.getText());
                            int tongTT = bll.laySLSachThucTe(txtMaSach.getText()) + Integer.parseInt(txtSoLuong.getText());
                            ET_Sach et = new ET_Sach(maSach, ten, tong, Integer.parseInt(gia), Integer.parseInt(nxb), Integer.parseInt(st), maTD, maNXB, maDM, maNN, tongTT);
                            ET_HoaDon HDon = new ET_HoaDon(mahd, maNV, maNCC);
                            String maCT = themCTHH();
                            ET_ChiTietHD CT = new ET_ChiTietHD(maCT, Integer.parseInt(sl), mahd, maSach);
                            bllHD.themHoaDon(HDon);
                            bllCTHD.themChiTietHD(CT);
                            try {
                                if (bll.suaSach(et)) {
                                    JOptionPane.showMessageDialog(null, "Thêm thành công");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Thêm không thành công");
                                }
                            } catch (SQLException ex) {
                                ex.printStackTrace();
                            }
                            resetMa();
                            hienHoaDon();
                        } else {
                            ET_Sach et = new ET_Sach(maSach, ten, Integer.parseInt(sl), Integer.parseInt(gia), Integer.parseInt(nxb), Integer.parseInt(st), maTD, maNXB, maDM, maNN, Integer.parseInt(sl));
                            try {
                                if (bll.themSach(et)) {
                                    JOptionPane.showMessageDialog(rootPane, "Thêm thành công");
                                } else {
                                    JOptionPane.showMessageDialog(rootPane, "Thêm không thành công");
                                }
                                hienHoaDon();
                            } catch (SQLException ex) {
                                ex.printStackTrace();
                            }
                            ET_HoaDon HDon = new ET_HoaDon(mahd, maNV, maNCC);
                            String maCT = themCTHH();
                            ET_ChiTietHD CT = new ET_ChiTietHD(maCT, Integer.parseInt(sl), mahd, maSach);
                            bllHD.themHoaDon(HDon);
                            bllCTHD.themChiTietHD(CT);
                            resetMa();
                            hienHoaDon();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Mã nhân viên không tồn tại");
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        int kq = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát không", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (kq == 0) {
            this.dispose();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThoatActionPerformed

    private void tblDSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDSMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDSMouseClicked

    private void btnNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewMouseClicked
        try {
            reset();
        } catch (Exception ex) {
            Logger.getLogger(frmNhapSach.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnNewMouseClicked
    public void hienThi() {
        DefaultTableModel model = (DefaultTableModel) tblDS.getModel();
        model.setColumnCount(0);
        model.setRowCount(0);
        model.addColumn("Mã Hoá Đơn");
        model.addColumn("Nhân Viên Nhập");
        model.addColumn("Tên Sách");
        model.addColumn("Số Lượng");
        model.addColumn("Giá");
        model.addColumn("Ngày nhập");
        model.addColumn("Nhà Cung Cấp");
        tblDS.setModel(model);

    }

    public void reset() throws Exception, Exception, Exception {
        txtGia.setText("");
        txtMaHD.setText("");
        txtMaSach.setText("");
        txtNamXB.setText("");
        txtSoLuong.setText("");
        txtSoTrang.setText("");
        txtTacGia.setText("");
        txtTenSach.setText("");
        cboDM.setSelectedIndex(0);
        cboNCC.setSelectedIndex(0);
        cboNN.setSelectedIndex(0);
        cboNV.setSelectedIndex(0);
        cboNXB.setSelectedIndex(0);
    }
    public void resetMa() throws SQLException {
        ResultSet rs = bllHD.layDS();
        rs.last();
        int row = rs.getRow();
        if (row == 0) {
            STT = 1;
        } else {
            rs.beforeFirst();
            while (rs.next()) {
                STT = Integer.parseInt(rs.getObject(1).toString().substring(2)) + 1;
            }
        }
        String ma = String.format("%02d", STT);
        txtMaHD.setText("HD" + ma);
        hienThi();
    }
    public void comboboxDM() throws Exception {
        bllDM = new BLL_DanhMuc();
        cboDM.removeAllItems();
        ResultSet rs = bllDM.layDM();
        while (rs.next()) {
            cboDM.addItem(rs.getString("name"));
        }
    }

    public void comboboxNXB() throws Exception {
        bllNXB = new BLL_NXB();
        cboNXB.removeAllItems();
        ResultSet rs = bllNXB.layDS();
        while (rs.next()) {
            cboNXB.addItem(rs.getString("name"));
        }
    }

    public void comboboxNN() throws Exception {
        bllNN = new BLL_NgonNgu();
        cboNN.removeAllItems();
        ResultSet rs = bllNN.layNgonNgu();
        while (rs.next()) {
            cboNN.addItem(rs.getString("name"));
        }
    }

    public void comboboxNCC() throws Exception {
        bllNCC = new BLL_NhaCungCap();
        cboNCC.removeAllItems();
        ResultSet rs = bllNCC.layNCC();
        while (rs.next()) {
            cboNCC.addItem(rs.getString("supplier_name"));
        }
    }

    public void comboboxNV() throws SQLException {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        ResultSet rs = bllNV.layNV();
        while (rs.next()) {
            ET_NhanVien NhanVien = new ET_NhanVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDate(6), rs.getString(7));
            arr_NhanVien.add(NhanVien);
            model.addElement(NhanVien);
        }
        cboNV.setModel(model);
    }

    public void hienHoaDon() throws SQLException, Exception {
        ResultSet rs = bllHD.layDS();
        DefaultTableModel model = (DefaultTableModel) tblDS.getModel();
        model.setNumRows(0);
        while (rs.next()) {
            ResultSet CTHD = bllCTHD.layTimCTHD(rs.getObject(1).toString());
            while (CTHD.next()) {
                Object[] col = new Object[7];
                for (int i = 1; i <= 7; i++) {
                    if (i == 1) {
                        col[i - 1] = rs.getObject(1).toString();
                    } else if (i == 2) {
                        col[i - 1] = bllNV.layTen(rs.getObject(2).toString());
                    } else if (i == 3) {
                        col[i - 1] = bll.layTen(CTHD.getObject(4).toString());
                    } else if (i == 4) {
                        col[i - 1] = CTHD.getObject(2);
                    } else if (i == 5) {
                        col[i - 1] = bll.layGia(CTHD.getObject(4).toString());
                    } else if (i == 7) {
                        col[i - 1] = bllNCC.layTenNCC(rs.getObject(4).toString());
                    } else {
                        col[i - 1] = rs.getObject(3).toString();
                    }
                }
                model.addRow(col);
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnthem;
    private javax.swing.JComboBox<String> cboDM;
    private javax.swing.JComboBox<String> cboNCC;
    private javax.swing.JComboBox<String> cboNN;
    private javax.swing.JComboBox<String> cboNV;
    private javax.swing.JComboBox<String> cboNXB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDS;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMaHD;
    private javax.swing.JTextField txtMaSach;
    private javax.swing.JTextField txtNamXB;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtSoTrang;
    private javax.swing.JTextField txtTacGia;
    private javax.swing.JTextField txtTenSach;
    // End of variables declaration//GEN-END:variables
}
