/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bll;

import java.sql.ResultSet;
import dal.DAL_LoaiDocGia;
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
}
