/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bll;

import dal.DAL_NhanVien;
import et.ET_NhanVien;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author yushu
 */
public class BLL_NhanVien {
    private DAL_NhanVien dal;
    public BLL_NhanVien() throws Exception {
        dal = new DAL_NhanVien();
    }
    public Boolean themNV(ET_NhanVien et) throws SQLException, Exception {
        return dal.themNhanVien(et);
    }
    
     public Boolean xoaNV(ET_NhanVien et) throws SQLException {
        return dal.xoaNhanVien(et);
    }
     
      public Boolean suaNV(ET_NhanVien et) throws SQLException {
        return dal.suaNhanVien(et);
    }
    
    public ResultSet layNV() throws SQLException {
        return dal.layNhanVien();
    }
    
     public Boolean checkTT(String ma) throws SQLException {
        return dal.checkTonTai(ma);
    }
     
      public Boolean checkCCCD(String cccd) throws SQLException {
        return dal.checkTonTaiCCCD(cccd);
    }
      
      public String layMa(String ten) throws Exception {
        return dal.layMaNV(ten);
    }
     public String layTen(String ma) throws Exception {
        return dal.layTen(ma);
    }
}
