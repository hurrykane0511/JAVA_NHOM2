/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

import dal.DAL_ChiTietHD;
import et.ET_ChiTietHD;
import et.ET_HoaDon;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public class BLL_ChiTietHD {
     private DAL_ChiTietHD dal;

    public BLL_ChiTietHD() throws Exception {
        dal = new DAL_ChiTietHD();
    }
    
    public boolean themChiTietHD(ET_ChiTietHD et) throws SQLException {
        return dal.themChiTietHD(et);
    }
    public boolean checkTonTai(String ma) throws SQLException{
        return dal.checkTonTai(ma);
    }
    public ResultSet layDS() throws SQLException, Exception {
        return dal.layDS();
    }
    public ResultSet layTimCTHD(String maHD) throws SQLException, Exception {
        return dal.timCTHD(maHD);
    }
}
