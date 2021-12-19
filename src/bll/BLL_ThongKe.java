/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bll;

import com.mysql.cj.xdevapi.Result;
import java.sql.ResultSet;
import java.sql.SQLException;
import dal.DAL_ThongKe;

/**
 *
 * @author dthan
 */
public class BLL_ThongKe {

    private DAL_ThongKe dal;

    public BLL_ThongKe() throws Exception {
        dal = new DAL_ThongKe();
    }

    public ResultSet muonNhieu() throws SQLException {
        return dal.muonNhieu();
    }

    public ResultSet muonNhieuNhatThang() throws SQLException {
        return dal.muonNhieuNhatThang();
    }

    public ResultSet docGiaChuaTraSach() throws SQLException {
        return dal.docGiaChuaTraSach();
    }

    public ResultSet docGiaQuaHanTra() throws SQLException {
        return dal.docGiaQuaHanTra();
    }
}
