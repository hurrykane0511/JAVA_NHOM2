/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bll;


import dal.DAL_TraSachh;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import et.ET_TraSachh;
/**
 *
 * @author dthan
 */
public class BLL_TraSachh {
    
    private DAL_TraSachh dal;

    public BLL_TraSachh() throws Exception {
        dal = new DAL_TraSachh();
    }

    public ResultSet layTraSach() throws SQLException {
        return dal.layTraSach();
    }

    public boolean themTraSach(ET_TraSachh et) throws SQLException {
        return dal.themTraSach(et);
    }

    public ResultSet timTraSach(String ma) throws SQLException {
        return dal.timTraSach(ma);
    }

    public ResultSet layDSNhanVien() throws Exception {
        return dal.layDSNhanVien();
    }

    public String layTenDocGia(String madg) throws SQLException, Exception {
        ResultSet rs = dal.layTenDocGia(madg);
        String ten = "";
        while (rs.next()) {
            ten = rs.getString("TenDG");
        }
        return ten;
    }

    public HashMap hm_NV() throws Exception {
       ResultSet rs = layDSNhanVien();
        HashMap<String, String> hm_nv = new HashMap<String, String>();
        try {
            while (rs.next()) {
                hm_nv.put(rs.getString("MaNV"), rs.getString("TenNV"));
            }
        } catch (Exception e) {
            
        }
        return hm_nv;

    }
//    public ResultSet cbbGetMaSach() throws SQLException {
//        return dal.cbbGetMaSach();
//    }

//    public ResultSet cbbGetMaNV() throws SQLException {
//        return dal.cbbGetMaNV();
//    }
}
