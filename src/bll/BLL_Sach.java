/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

import dal.DAL_Sach;
import et.ET_Sach;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author PC
 */
public class BLL_Sach {
     private DAL_Sach dal;

    public BLL_Sach() throws Exception {
        dal = new DAL_Sach();
    }   
    public ResultSet layDS() throws SQLException, Exception {
        return dal.layDS();
    }   
    public Boolean themSach(ET_Sach et) throws SQLException, Exception {
        return dal.themSach(et);
    }
    public Boolean suaSach(ET_Sach et) throws SQLException, Exception {
        return dal.suaSach(et);
    }
    public Boolean xoaSach(String et) throws SQLException, Exception {
        return dal.xoaSach(et);
    }
    public boolean checkTonTai(String ma) throws SQLException{
        return dal.checkTonTai(ma);
    }
    public int laySLSach(String ma) throws SQLException, Exception{
        return  Integer.parseInt(dal.laySLSach(ma));
    }
    public String layTen(String ma) throws Exception{
        return dal.layTen(ma);
    }
     public String layGia(String ma) throws Exception{
        return dal.layGia(ma);
    }
}
