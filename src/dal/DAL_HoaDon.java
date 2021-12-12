/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import et.ET_HoaDon;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java_connection.DatabaseUtil;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class DAL_HoaDon {
    private Connection conn;

    public DAL_HoaDon() throws Exception {
        conn = DatabaseUtil.getConnection();
    }
    public ResultSet layHoaDon() throws SQLException {
        ResultSet rs = null;
        Connection conn = null;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String sql = "select * from inv_deli_voucher";
            rs = st.executeQuery(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }
    public boolean themHoaDon(ET_HoaDon et) throws SQLException {
        Statement st = conn.createStatement();
        String sql = "insert into inv_deli_voucher(id_idv,id_staff,id_supplier)"
                + "values('"+et.getMaHD()+"','"+et.getMaNV()+"','"+et.getMaNCC()+"')";
        if (st.executeUpdate(sql) > 0) {
            return true;
        }
        return false;
    }
    public Boolean checkTonTai(String ma) throws SQLException {
        Connection conn = null;;
        ResultSet rs = null;
        int row = 0;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql = "Select * from inv_deli_voucher where 	id_idv = '" + ma + "'";
            rs = st.executeQuery(sql);
            rs.last();
            row = rs.getRow();
            rs.beforeFirst();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return (row > 0);
    }
}
