/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bll;

import dal.DAL_MuonSach;
import java.sql.ResultSet;
import java.util.HashMap;
import et.ET_MuonSach;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author son2lk
 */
public class BLL_MuonSach {
    
    DAL_MuonSach dal_muonsach;
    
    public BLL_MuonSach() throws Exception {
        this.dal_muonsach = new DAL_MuonSach();
    }
    
    public ResultSet LayDSNhanVien() throws Exception {
        return dal_muonsach.layDSNhanVien();
    }
    
    public ResultSet LayDSPM() throws Exception {
        return dal_muonsach.LayDSPhieu();
    }
    
    public void SetTable(JTable tb) throws Exception {
        
        ResultSet rs = LayDSPM();
        
        while (rs.next()) {
            
            String maphieu = rs.getString("Mã phiếu");
            String mathe = rs.getString("Mã thẻ");
            String manv = rs.getString("Mã NV");
            String masach = rs.getString("Mã Sách");
            String ngaymuon = rs.getString("Ngày mượn");
            String ngaytra = rs.getString("Ngày phải trả");
            String tinhtrang = rs.getString("Tình trạng sách");
            
            String[] row = {maphieu, mathe, manv, masach, ngaymuon, ngaytra, tinhtrang};
            DefaultTableModel tableModel = (DefaultTableModel) tb.getModel();
            tableModel.addRow(row);
        }
    }
    
    public boolean ChoMuon(ET_MuonSach phieu) throws SQLException {
        return dal_muonsach.ChoMuonSach(phieu);
    }
    
    public boolean SuaPhieu(ET_MuonSach phieu, String maphieu) throws SQLException {
        return dal_muonsach.SuaPhieuMuon(phieu, maphieu);
    }
    
    public boolean XoaPhieu(String phieu) throws SQLException {
        return dal_muonsach.XoaPhieuMuon(phieu);
    }
    
    public String GetTenDG(String madg) throws SQLException, Exception {
        ResultSet rs = dal_muonsach.LayDG(madg);
        String ten = "";
        while (rs.next()) {
            ten = rs.getString("TenDG");
        }
        return ten;
    }
    
    public HashMap hm_NV() throws Exception {
        ResultSet rs = LayDSNhanVien();
        HashMap<String, String> hm_nv = new HashMap<String, String>();
        try {
            while (rs.next()) {
                hm_nv.put(rs.getString("MaNV"), rs.getString("TenNV"));
            }
        } catch (Exception e) {
            
        }
        return hm_nv;
    }
}
