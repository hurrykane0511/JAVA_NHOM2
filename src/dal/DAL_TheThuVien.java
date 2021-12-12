/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import et.ET_TheThuVien;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java_connection.DatabaseUtil;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class DAL_TheThuVien {
    public ResultSet layDSThe() throws SQLException {
        ResultSet rs = null;
        Connection conn = null;
        try {
            conn = DatabaseUtil.getConnection();
             Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql = "SELECT id_lib_card, readers.lastname ,readers.firstname,readers.pid,readers.gender,readers.birthday,readers.address, created_at,id_staff, expiration_date FROM member_card join readers on member_card.id_reader = readers.id_reader";
            rs = st.executeQuery(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        //rs.close();
        //conn.close();
        return rs;
    }
    
     public ResultSet layDSTheTV() throws SQLException {
        ResultSet rs = null;
        Connection conn = null;
        try {
            conn = DatabaseUtil.getConnection();
             Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql = "SELECT * from member_card";
            rs = st.executeQuery(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }
    public Boolean themTheThuVien(ET_TheThuVien et) throws SQLException, Exception {
        Boolean kq = false;
        Connection conn = null;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement();
            String sql = "insert into member_card (id_lib_card,id_staff,id_reader,expiration_date) "
                    + "values ('" + et.getMaThe()+ "','" + et.getMaNhanVien()+ "','" + et.getMaDocGia()+ "','"+new java.sql.Date(et.getNgayHetHan().getTime())+"')";
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
            String sql = "Select * from member_card where id_lib_card = '" + ma + "'";
            rs = st.executeQuery(sql);
            rs.last();
            row = rs.getRow();
            rs.beforeFirst();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return (row > 0);
    }

  public Boolean giaHanTheThuVien(String maThe) throws SQLException, Exception {
        Boolean kq = false;
        Connection conn = null;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement();
            long millis = System.currentTimeMillis();
            String sql = "UPDATE member_card SET expiration_date = '"+new java.sql.Date(millis)+"' WHERE id_lib_card = '"+maThe+"'";
            if (st.executeUpdate(sql) > 0) {
                kq = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        //conn.close();
        return kq;
    }
}
