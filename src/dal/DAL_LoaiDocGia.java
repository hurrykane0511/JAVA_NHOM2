/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import et.ET_LoaiDocGia;
import et.ET_DocGia;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java_connection.DatabaseUtil;
import javax.swing.JOptionPane;

/**
 *
 * @author yushu
 */
public class DAL_LoaiDocGia {

    // lấy danh sách loại độc giả
    public ResultSet layDS() throws SQLException, Exception {
        Connection conn = null;
        ResultSet rs = null;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql = "select * from reader_type";
            rs = st.executeQuery(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }

    // thêm loại độc giả
    public Boolean themLoai(ET_LoaiDocGia et) throws SQLException, Exception {
        Connection conn = null;
        Boolean kq = false;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement();
            String sql = "insert into reader_type(name, quantity, lib_fee)"
                    + " values('" + et.getTenLoai() + "'," + et.getsLSachMuon() + ", " + et.getPhi() + ")";
            if (st.executeUpdate(sql) > 0) {
                kq = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return kq;
    }

    // sửa loại độc giả
    public Boolean suaLoai(ET_LoaiDocGia et) throws SQLException, Exception {
        Connection conn = null;
        Boolean kq = false;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement();
            String sql = "update reader_type "
                    + "set name = '" + et.getTenLoai() + "', "
                    + "quantity =" + et.getsLSachMuon() + ", "
                    + "lib_fee = " + et.getPhi() + " "
                    + "where type_id = " + et.getMaLoai() + "";
            if (st.executeUpdate(sql) > 0) {
                kq = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return kq;
    }

    // xóa loại độc giả
    public Boolean xoaLoai(int maLoai) throws SQLException, Exception {
        Connection conn = null;
        Boolean kq = false;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement();
            String sql = "delete from reader_type where type_id = " + maLoai + "";
            if (st.executeUpdate(sql) > 0) {
                kq = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return kq;
    }

}
