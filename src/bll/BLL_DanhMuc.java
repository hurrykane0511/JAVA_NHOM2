/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bll;
import et.ET_DanhMuc;
import dal.DAL_DanhMuc;
import java.sql.ResultSet;
/**
 *
 * @author yushu
 */
public class BLL_DanhMuc {
    DAL_DanhMuc dal ;
    public BLL_DanhMuc() {
        dal = new DAL_DanhMuc();
    }
    
    public ResultSet layDM() throws Exception {
        return dal.layDS();
    }
    public boolean themDM(ET_DanhMuc et) throws Exception {
        return dal.themDM(et);
    }
    public boolean xoaDM(String maDM) throws Exception {
        return dal.xoaDM(maDM);
    }
    public boolean suaDM(ET_DanhMuc et) throws Exception {
        return dal.suaDM(et);
    }
     public String layMa(String ten) throws Exception {
        return dal.layMaDM(ten);
    }
    public String layTen(String ma) throws Exception {
        return dal.layTenDM(ma);
    }
}
