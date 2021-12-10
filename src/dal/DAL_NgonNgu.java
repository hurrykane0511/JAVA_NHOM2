/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java_connection.DatabaseUtil;
import et.ET_NgonNgu;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author dthan
 */
public class DAL_NgonNgu {

    private Connection conn;

    public DAL_NgonNgu() throws Exception {
        conn = DatabaseUtil.getConnection();
    }

    public ResultSet layNgonNgu() throws SQLException {
        Connection conn = null;
        ResultSet rs = null;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String sql = "select * from languages";
            rs = st.executeQuery(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }

    public Boolean themNgonNgu(ET_NgonNgu et) throws SQLException {
        Statement st = conn.createStatement();
        String sql = "INSERT INTO languages(id_language, name)"
                + "VALUES(?, ?)";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, et.getMaNgonNgu());
            pst.setString(2, et.getTenNgonNgu());
            return pst.executeUpdate() > 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean suaNgonNgu(ET_NgonNgu et) throws SQLException {

        Statement st = conn.createStatement();
        String sql = "UPDATE languages SET name = ? WHERE id_language = ?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(2, et.getMaNgonNgu());
            pst.setString(1, et.getTenNgonNgu());
            return pst.executeUpdate() > 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean xoaNgonNgu(ET_NgonNgu et) throws SQLException {
        Statement st = conn.createStatement();
        String sql = "DELETE FROM languages WHERE id_language = ?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, et.getMaNgonNgu());
            return pst.executeUpdate() > 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean checkNN(String maNgonNgu) throws SQLException {
        Connection conn = null;;
        ResultSet rs = null;
        int row = 0;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql = "Select * from languages where id_language = '" + maNgonNgu + "'";
            rs = st.executeQuery(sql);
            rs.last();
            row = rs.getRow();
            rs.beforeFirst();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return (row > 0);
    }
    public Boolean checkTonTai(String ma) throws SQLException {
        Connection conn = null;;
        ResultSet rs = null;
        int row = 0;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql = "Select * from languages where id_language = '" + ma + "'";
            rs = st.executeQuery(sql);
            rs.last();
            row = rs.getRow();
            rs.beforeFirst();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return (row > 0);
    }
    public String layMaNN(String tenNN) throws Exception {
        Connection conn = null;
        conn = DatabaseUtil.getConnection();
        ResultSet rs = null;
        Statement st = conn.createStatement();
        String sql = "select * from languages where name = '"+tenNN+"' limit 1";
        rs = st.executeQuery(sql);
        String ma = "";
        while (rs.next()) {
            ma = rs.getObject(1).toString();
            break;
        }
        return ma;
    }
    public String layTen(String maNN) throws Exception {
        Connection conn = null;
        conn = DatabaseUtil.getConnection();
        ResultSet rs = null;
        Statement st = conn.createStatement();
        String sql = "select * from languages where id_language	 = '"+maNN+"' limit 1";
        rs = st.executeQuery(sql);
        String ma = "";
        while (rs.next()) {
            ma = rs.getObject(2).toString();
            break;
        }
        return ma;
    }
}
