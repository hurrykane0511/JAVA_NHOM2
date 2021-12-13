/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import et.ET_DanhMuc;
import et.ET_TaiKhoan;
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
public class DAL_DanhMuc {

    // lấy danh sách
    public ResultSet layDS() throws SQLException, Exception {
        Connection conn = null;
        ResultSet rs = null;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql = "select * from categories ";
            rs = st.executeQuery(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }

    // lấy mã danh mục
    public String layMaDM(String tenDM) throws Exception {
        Connection conn = null;
        conn = DatabaseUtil.getConnection();
        ResultSet rs = null;
        Statement st = conn.createStatement();
        String sql = "select * from categories where name = '" + tenDM + "'";
        rs = st.executeQuery(sql);
        String ma = "";
        while (rs.next()) {
            ma = (String) rs.getObject(1);
        }
        return ma;
    }

    // lấy tên danh mục
    public String layTenDM(String maDM) throws Exception {
        Connection conn = null;
        conn = DatabaseUtil.getConnection();
        ResultSet rs = null;
        Statement st = conn.createStatement();
        String sql = "select * from categories where id_category = '" + maDM + "'";
        rs = st.executeQuery(sql);
        String ma = "";
        while (rs.next()) {
            ma = (String) rs.getObject(2);
        }
        return ma;
    }

    // check tồn tại mã danh mục
    public Boolean checkTT(String maDM) throws SQLException, Exception {
        Connection conn = null;;
        ResultSet rs = null;
        int row = 0;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql = "Select * from categories where id_category = '" + maDM + "'";
            rs = st.executeQuery(sql);
            rs.last();
            row = rs.getRow();
            rs.beforeFirst();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        //conn.close();
        return (row > 0);
    }

    // thêm danh mục
    public Boolean themDM(ET_DanhMuc et) throws SQLException, Exception {
        Connection conn = null;
        Boolean kq = false;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement();
            String sql = "insert into categories(id_category, name)"
                    + " values('" + et.getMaDanhMuc() + "','" + et.getTenDanhMuc() + "')";
            if (st.executeUpdate(sql) > 0) {
                kq = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return kq;
    }

    // sửa danh mục
    public Boolean suaDM(ET_DanhMuc et) throws SQLException, Exception {
        Connection conn = null;
        Boolean kq = false;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement();
            String sql = "update categories "
                    + "set name = '" + et.getTenDanhMuc() + "' "
                    + "where id_category = '" + et.getMaDanhMuc() + "'";
            if (st.executeUpdate(sql) > 0) {
                kq = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return kq;
    }

    // xóa danh mục
    public Boolean xoaDM(String maDM) throws SQLException, Exception {
        Connection conn = null;
        Boolean kq = false;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement();
            String sql = "delete from categories where id_category = '" + maDM + "'";
            if (st.executeUpdate(sql) > 0) {
                kq = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return kq;
    }

    // check danh mục
    public ResultSet checkDM(String maDM) throws Exception {
        Connection conn = null;
        ResultSet rs = null;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String sql = "select * from users where username = '" + maDM + "'";
            rs = st.executeQuery(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }
}
