/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

import dal.DAL_HoaDon;
import et.ET_HoaDon;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public class BLL_HoaDon {
     private DAL_HoaDon dal;

    public BLL_HoaDon() throws Exception {
        dal = new DAL_HoaDon();
    }
    
    public boolean themHoaDon(ET_HoaDon et) throws SQLException {
        return dal.themHoaDon(et);
    }
    public boolean checkTonTai(String ma) throws SQLException{
        return dal.checkTonTai(ma);
    }
}
