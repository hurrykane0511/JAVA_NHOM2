/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

import et.ET_NhaCungCap;
import dal.DAL_NhaCungCap;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class BLL_NhaCungCap {
    DAL_NhaCungCap dal;
    public BLL_NhaCungCap() {
        dal = new DAL_NhaCungCap();
    }
    public String layMa(String ten) throws Exception {
        return dal.layMaNCC(ten);
    }
    public Boolean themNCC(ET_NhaCungCap et) throws SQLException, Exception {
        return dal.themNCC(et);
    }
     public Boolean xoaNCC(ET_NhaCungCap et) throws SQLException {
        return dal.xoaNCC(et);
    }
      public Boolean suaNCC(ET_NhaCungCap et) throws SQLException {
        return dal.suaNCC(et);
    }
    public Boolean checkTT(String ma) throws SQLException {
        return dal.checkTonTai(ma);
    }
    
    public ResultSet layNCC() throws SQLException {
        return dal.layNCC();
    }
}
