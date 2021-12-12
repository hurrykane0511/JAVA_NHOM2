/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java_connection.DatabaseUtil;
import et.ET_NhanVien;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author yushu
 */
public class DAL_NhanVien {

    public ResultSet layNhanVien() throws SQLException {
        ResultSet rs = null;
        Connection conn = null;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String sql = "select * from staffs";
            rs = st.executeQuery(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }

    public Boolean themNhanVien(ET_NhanVien et) throws SQLException, Exception {
        Boolean kq = false;
        Connection conn = null;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement();
            String sql = "insert into staffs (id_staff, firstname, lastname, address, phone_number,birthday, pid) "
                    + "values ('" + et.getMaNhanVien() + "','" + et.getTen() + "','" + et.getHo() + "','" + et.getDiaChi() + "','" + et.getSoDT() + "','" + new java.sql.Date(et.getNgaySinh().getTime()) + "','" + et.getCCCD() + "')";
            if (st.executeUpdate(sql) > 0) {
                kq = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        //conn.close();
        return kq;
    }

    public Boolean checkTonTai(String ma) throws SQLException {
        Connection conn = null;;
        ResultSet rs = null;
        int row = 0;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql = "Select * from staffs where id_staff = '" + ma + "'";
            rs = st.executeQuery(sql);
            rs.last();
            row = rs.getRow();
            rs.beforeFirst();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return (row > 0);
    }

    public Boolean xoaNhanVien(ET_NhanVien et) throws SQLException {
        Boolean kq = false;
        Connection conn = null;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement();
            String sql = "delete from staffs where id_staff = '" + et.getMaNhanVien() + "'";
            if (st.executeUpdate(sql) > 0) {
                kq = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        //conn.close();
        return kq;
    }

    public Boolean suaNhanVien(ET_NhanVien et) throws SQLException {
        Boolean kq = false;
        Connection conn = null;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement();
            String sql = "update staffs "
                    + "set firstname ='" + et.getTen() + "', "
                    + "lastname = '" + et.getHo() + "', "
                    + "address = '" + et.getDiaChi() + "',"
                    + "phone_number = '" + et.getSoDT() + "',"
                    + "birthday = '" + new java.sql.Date(et.getNgaySinh().getTime()) + "',"
                    + "pid = '" + et.getCCCD() + "'"
                    + "where id_staff ='" + et.getMaNhanVien() + "'";
            if (st.executeUpdate(sql) > 0) {
                kq = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        //conn.close();
        return kq;
    }
     public String layMaNV(String tenNV) throws Exception {
        Connection conn = null;
        conn = DatabaseUtil.getConnection();
        ResultSet rs = null;
        Statement st = conn.createStatement();
        String sql = "select * from staffs where firstname = '"+tenNV+"' limit 1";
        rs = st.executeQuery(sql);
        String ma = "";
        while (rs.next()) {
            ma = rs.getObject(1).toString();
            break;
        }
        return ma;
    }
    public String layTen(String maNV) throws Exception {
        Connection conn = null;
        conn = DatabaseUtil.getConnection();
        ResultSet rs = null;
        Statement st = conn.createStatement();
        String sql = "select * from staffs where id_staff = '"+maNV+"' limit 1";
        rs = st.executeQuery(sql);
        String ten = "";
        while (rs.next()) {
            ten = rs.getObject(2).toString();
            break;
        }
        return ten;
    }

}
