/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;
import dal.DAL_DocGia;
import et.ET_DocGia;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class BLL_DocGia {
     private DAL_DocGia dal;
    public BLL_DocGia() throws Exception {
        dal = new DAL_DocGia();
    }
     public Boolean themDG(ET_DocGia et) throws SQLException, Exception {
        return dal.themDocGia(et);
    }
     public Boolean checkTT(String cccd) throws SQLException, Exception {
        return dal.checkTT(cccd);
    }
      public Boolean xoaThe(ET_DocGia et) throws SQLException {
        return dal.xoaThe(et);
    }
}

