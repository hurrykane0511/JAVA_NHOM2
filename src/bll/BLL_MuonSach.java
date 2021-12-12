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
import java.util.Date;
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

    
    
    public boolean DuocMuon(String mathe) throws SQLException {
        ResultSet rs = dal_muonsach.GetStatus(mathe);
        int dangMuon = 0, duocMuon = 0;
        while (rs.next()) {
            dangMuon = Integer.parseInt(rs.getString("sum"));
            duocMuon = Integer.parseInt(rs.getString("quantity"));
        }
        if (dangMuon >= duocMuon) {
            return false;
        }
        return true;
    }

    public boolean HetHan(String mathe) throws SQLException {
        ResultSet rs = dal_muonsach.GetStatus(mathe);
        Date ngayhethan = new Date();
        while (rs.next()) {
            ngayhethan = rs.getDate("hethan");
        }
        Date now = new Date();
        return ngayhethan.compareTo(now) > 0;

    }
    public boolean GetQtyBook(String masach) throws SQLException {
        ResultSet rs = dal_muonsach.GetQtyBook(masach);
        int book = 0;
        while (rs.next()) {
            
            book = rs.getInt("reality_quantity");
            
        }
        Date now = new Date();
        return book > 0;

    }
    public void SetTable(JTable tb) throws Exception {

        ResultSet rs = LayDSPM();

        while (rs.next()) {

            String maphieu = rs.getString("id_rental_detail");
            String mathe = rs.getString("id_lib_card");
            String manv = rs.getString("id_staff");
            String masach = rs.getString("id_book");
            String ngaymuon = rs.getString("borrowed_date");
            String ngaytra = rs.getString("return_date");
            String tinhtrang = rs.getString("status");
            String trangthai = rs.getString("status_borow");

            String[] row = {maphieu, mathe, manv, masach, ngaymuon, ngaytra, tinhtrang, trangthai};
            DefaultTableModel tableModel = (DefaultTableModel) tb.getModel();
            tableModel.addRow(row);

        }
    }

    public boolean ChoMuon(ET_MuonSach phieu) throws SQLException {
        return dal_muonsach.ChoMuonSach(phieu);
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
