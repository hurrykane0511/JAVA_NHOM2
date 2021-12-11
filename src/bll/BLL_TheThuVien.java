/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

import dal.DAL_TheThuVien;
import et.ET_TheThuVien;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class BLL_TheThuVien {
     private DAL_TheThuVien dal;
    public BLL_TheThuVien() throws Exception {
        dal = new DAL_TheThuVien();
    }
    public ResultSet layDSThe() throws SQLException {
        return dal.layDSThe();
    }
    public Boolean themThe(ET_TheThuVien et) throws SQLException, Exception {
        return dal.themTheThuVien(et);
    }
     
     public Boolean checkTT(String ma) throws SQLException {
        return dal.checkTonTai(ma);
    }
    
}
