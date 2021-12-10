/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;
import dal.DAL_CapNhatSach;
import et.ET_Sach;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author LENOVO
 */
public class Bll_CapNhatSach {
    DAL_CapNhatSach dal;
    public Bll_CapNhatSach() {
        dal = new DAL_CapNhatSach();
    }
    public ResultSet layDSSach() throws SQLException {
        return dal.layDSSach();
    }
     public Boolean suaSach(ET_Sach et) throws SQLException {
        return dal.suaSach(et);
    }
}
