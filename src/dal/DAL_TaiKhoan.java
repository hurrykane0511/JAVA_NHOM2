/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java_connection.DatabaseUtil;
import et.ET_TaiKhoan;
import javax.swing.JOptionPane;

/**
 *
 * @author yushu
 */
public class DAL_TaiKhoan {

    public ResultSet layDS() throws SQLException, Exception {
        Connection conn = null;
        ResultSet rs = null;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql = "select * from users";
            rs = st.executeQuery(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }
    
      public ResultSet checkDN(String tenDN, String mk) throws Exception {
        Connection conn = null;
        ResultSet rs = null;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String sql = "select * from users where username = '"+tenDN+"' and password = '" + mk+"'";
            rs = st.executeQuery(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }
    public Boolean checkTK(String maTK) throws SQLException, Exception {
         Connection conn = null;;
        ResultSet rs = null;
        int row = 0;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql = "Select * from users where id_user = '" + maTK + "'" ;
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


    public Boolean themTK(ET_TaiKhoan et) throws SQLException, Exception {
        Connection conn = null;
        Boolean kq = false;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement();
             String sql = "insert into users(id_user, username, password, role, id_staff)"
                    + " values('"+et.getMaTK()+"','"+et.getTenDN()+"','"+et.getMatKhau()+"','"+et.getLoaiTK()+"','"+et.getMaNV()+"')";
            if (st.executeUpdate(sql) > 0) {
                kq = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return kq;
    }
    public Boolean suaTK(ET_TaiKhoan et) throws SQLException, Exception {
        Connection conn = null;
        Boolean kq = false;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement();
            String sql = "update users "
                    + "set username = '"+et.getTenDN()+"',"
                    + " password = '"+et.getMatKhau()+"', "
                    + "role = '"+et.getLoaiTK()+"', "
                    + "id_staff = '"+et.getMaNV()+"'"
                    + "where id_user = '"+ et.getMaTK()+"'";
            if (st.executeUpdate(sql) > 0) {
                kq = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return kq;
    }
    
    public Boolean xoaTK(ET_TaiKhoan et) throws SQLException, Exception {
        Connection conn = null;
        Boolean kq = false;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement();
            String sql = "delete from users where id_user = '"+et.getMaTK()+"'";
            if (st.executeUpdate(sql) > 0) {
                kq = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return kq;
    }
    
  
}
