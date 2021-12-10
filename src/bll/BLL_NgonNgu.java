/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;
import dal.DAL_NgonNgu;
import et.ET_NgonNgu;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class BLL_NgonNgu {
    private DAL_NgonNgu dal;

    public BLL_NgonNgu() throws Exception {
        dal = new DAL_NgonNgu();
    }

   
    public String layMa(String ten) throws Exception {
        return dal.layMaNN(ten);
    }
     public String layTen(String ma) throws Exception {
        return dal.layTen(ma);
    }
       public ResultSet layDS() throws SQLException, Exception {
        return dal.layDS();
    }
}
