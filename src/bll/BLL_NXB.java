/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

import dal.DAL_NXB;
import et.ET_NXB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

/**
 *
 * @author PC
 */
public class BLL_NXB {

    private DAL_NXB dal;

    public BLL_NXB() throws Exception {
        dal = new DAL_NXB();
    }

    public String layMa(String ten) throws Exception {
        return dal.layMaNXB(ten);
    }
     public String layTen(String ma) throws Exception {
        return dal.layTenNXB(ma);
    }
      public ResultSet layDS() throws SQLException, Exception {
        return dal.layDS();
    }
       public ResultSet layDSSTT() throws SQLException, Exception {
        return dal.layDSSTT();
    }
       public boolean themNXB(ET_NXB et) throws SQLException, Exception {
        return dal.themNXB(et);
    }

    public boolean suaNXB(ET_NXB et) throws SQLException {
        return dal.suaNXB(et);
    }

    public boolean xoaNXB(String et) throws SQLException {
        return dal.xoaNXB(et);
    }
    public Boolean checkTT(String ma) throws SQLException {
        return dal.checkTonTai(ma);
    }
}
