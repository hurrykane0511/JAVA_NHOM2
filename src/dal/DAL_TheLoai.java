/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java_connection.DatabaseUtil;


/**
 *
 * @author LENOVO
 */
public class DAL_TheLoai {
     public String layMaTL(String tenTL) throws Exception {
        Connection conn = null;
        conn = DatabaseUtil.getConnection();
        ResultSet rs = null;
        Statement st = conn.createStatement();
        String sql = "select * from categories where title = '"+tenTL+"' limit 1";
        rs = st.executeQuery(sql);
        String ma = "";
        while (rs.next()) {
            ma = rs.getObject(1).toString();
            break;
        }
        return ma;
    }
    public String layTenTL(String maTL) throws Exception {
        Connection conn = null;
        conn = DatabaseUtil.getConnection();
        ResultSet rs = null;
        Statement st = conn.createStatement();
        String sql = "select * from categories where id_category = '"+maTL+"' limit 1";
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
        Statement st = conn.createStatement();
        String sql = "select * from categories";
        return st.executeQuery(sql);
    }
}
