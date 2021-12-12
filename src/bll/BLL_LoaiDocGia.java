/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bll;

import java.sql.ResultSet;
import dal.DAL_LoaiDocGia;
import et.ET_LoaiDocGia;
/**
 *
 * @author yushu
 */
public class BLL_LoaiDocGia {
private DAL_LoaiDocGia dal ;
    public BLL_LoaiDocGia() {
       dal = new DAL_LoaiDocGia(); 
    }
    
    public ResultSet layDS() throws Exception {
        return dal.layDS();
    }
    
    public Boolean themLoai(ET_LoaiDocGia et) throws Exception {
        return dal.themLoai(et);
    }
    
     public Boolean xoaLoai(int maLoai) throws Exception {
        return dal.xoaLoai(maLoai);
    }
     
      public Boolean suaLoai(ET_LoaiDocGia et) throws Exception {
        return dal.suaLoai(et);
    }
}
