/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bll;

import et.ET_NgonNgu;
import dal.DAL_NgonNgu;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author dthan
 */
public class BLL_NgonNgu {

    private DAL_NgonNgu dal;

    public BLL_NgonNgu() throws Exception {
        dal = new DAL_NgonNgu();
    }

    public ResultSet layNgonNgu() throws SQLException {
        return dal.layNgonNgu();
    }

    public boolean themNgonNgu(ET_NgonNgu et) throws SQLException {
        return dal.themNgonNgu(et);
    }

    public boolean suaNgonNgu(ET_NgonNgu et) throws SQLException {
        return dal.suaNgonNgu(et);
    }

    public boolean xoaNgonNgu(ET_NgonNgu et) throws SQLException {
        return dal.xoaNgonNgu(et);
    }

    public boolean checkNN(String  maNgonNgu) throws SQLException {
        return dal.checkNN(maNgonNgu);
    }
    public boolean checkTonTai(String ma) throws SQLException{
        return dal.checkTonTai(ma);
    }
    public String layMa(String ten) throws Exception {
        return dal.layMaNN(ten);
    }
     public String layTen(String ma) throws Exception {
        return dal.layTen(ma);
    }
}
