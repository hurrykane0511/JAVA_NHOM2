/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

import dal.DAL_TacGia;
import et.ET_TacGia;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class BLL_TacGia {
    private DAL_TacGia dal;

    public BLL_TacGia() throws Exception {
        dal = new DAL_TacGia();
    }
    public boolean themTD(ET_TacGia et) throws SQLException, Exception {
        return dal.themTD(et);
    }
   
    public String layMa(String ten) throws Exception {
        return dal.layMaTG(ten);
    }
     public String layTen(String ma) throws Exception {
        return dal.layTenTG(ma);
    }
       public ResultSet layDS() throws SQLException, Exception {
        return dal.layDS();
    }
       public boolean checkTonTai(String ma) throws SQLException{
        return dal.checkTonTai(ma);
    }
}
