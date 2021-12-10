/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;
import et.ET_NgonNgu;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java_connection.DatabaseUtil;

/**
 *
 * @author LENOVO
 */
public class DAL_NgonNgu {
    public String layMaNN(String tenNN) throws Exception {
        Connection conn = null;
        conn = DatabaseUtil.getConnection();
        ResultSet rs = null;
        Statement st = conn.createStatement();
        String sql = "select * from languages where title = '"+tenNN+"' limit 1";
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
    public ResultSet layDS() throws SQLException, Exception {
        Connection conn = null;
        conn = DatabaseUtil.getConnection();
        Statement st = conn.createStatement();
        String sql = "select * from languages";
        return st.executeQuery(sql);
    }
}
