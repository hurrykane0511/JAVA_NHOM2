/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

import dal.DAL_TheLoai;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class BLL_TheLoai {
     private DAL_TheLoai dal;

    public BLL_TheLoai() throws Exception {
        dal = new DAL_TheLoai();
    }

   
    public String layMa(String ten) throws Exception {
        return dal.layMaTL(ten);
    }
     public String layTen(String ma) throws Exception {
        return dal.layTenTL(ma);
    }
       public ResultSet layDS() throws SQLException, Exception {
        return dal.layDS();
    }
}
