/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bll;
import dal.DAL_TaiKhoan;
import et.ET_TaiKhoan;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author yushu
 */
public class BLL_TaiKhoan {
    private DAL_TaiKhoan dal;

    public BLL_TaiKhoan() throws Exception {
        dal = new DAL_TaiKhoan();
    }
    
    public ResultSet layDS() throws SQLException, Exception {
        return dal.layDS();
    }
    
     public Boolean checkTT(String maTK) throws SQLException, Exception {
        return dal.checkTK(maTK);
    }
     
    public Boolean themTK(ET_TaiKhoan et) throws SQLException, Exception {
        return dal.themTK(et);
    }
    
    public Boolean xoaTK(ET_TaiKhoan et) throws SQLException, Exception {
        return dal.xoaTK(et);
    }
    
    public Boolean suaTK(ET_TaiKhoan et) throws SQLException, Exception {
        return dal.suaTK(et);
    }
    
}
