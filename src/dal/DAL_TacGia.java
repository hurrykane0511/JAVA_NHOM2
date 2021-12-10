/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import et.ET_TacGia;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java_connection.DatabaseUtil;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class DAL_TacGia {
     public String layMaTG(String tenTG) throws Exception {
        Connection conn = null;
        conn = DatabaseUtil.getConnection();
        ResultSet rs = null;
        Statement st = conn.createStatement();
        String sql = "select * from authors where author_name = '"+tenTG+"' limit 1";
        rs = st.executeQuery(sql);
        String ma = "";
        while (rs.next()) {
            ma = rs.getObject(1).toString();
            break;
        }
        return ma;
    }
    public String layTenTG(String maTG) throws Exception {
        Connection conn = null;
        conn = DatabaseUtil.getConnection();
        ResultSet rs = null;
        Statement st = conn.createStatement();
        String sql = "select * from authors where id_author	 = '"+maTG+"' limit 1";
        rs = st.executeQuery(sql);
        String ma = "";
        while (rs.next()) {
            ma = rs.getObject(2).toString();
            break;
        }
        return ma;
    }
    public ResultSet layDS() throws SQLException, Exception {
        Connection conn = null;
        conn = DatabaseUtil.getConnection();
        Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
        String sql = "select * from authors";
        return st.executeQuery(sql);
    }
     public boolean themTD(ET_TacGia et) throws SQLException, Exception {
        Connection conn = null;
        conn = DatabaseUtil.getConnection();
        ResultSet rs = null;
        Statement st = conn.createStatement();
        String sql = "insert into authors(id_author,author_name)"
                + "values('" + et.getMaTG()+ "','" + et.getTenTG()+ "')";
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
            String sql = "Select * from authors where id_author = '" + ma + "'";
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
