/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import et.ET_NhaCungCap;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java_connection.DatabaseUtil;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author LENOVO
 */
public class DAL_NhaCungCap {
    
     public ResultSet layNCC() throws SQLException {
        ResultSet rs = null;
        Connection conn = null;
        try {
            conn = DatabaseUtil.getConnection();
             Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql = "select * from suppliers";
            rs = st.executeQuery(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }
      public Boolean themNCC(ET_NhaCungCap et) throws SQLException, Exception {
        Boolean kq = false;
        Connection conn = null;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement();
            String sql = "INSERT INTO suppliers(id_supplier, supplier_name,address,phone_number)"
                    + "values ('" + et.getMaNCC()+ "','"+ et.getTenNCC()+ "','"+ et.getDiaChiNCC()+ "','"+ et.getSdtNCC()+ "')";
            if (st.executeUpdate(sql) > 0) {
                kq = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
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
            String sql = "Select * from suppliers where id_supplier = '" + ma + "'";
            rs = st.executeQuery(sql);
            rs.last();
            row = rs.getRow();
            rs.beforeFirst();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return (row > 0);
    }
      public Boolean xoaNCC(String maNCC) throws SQLException {
        Boolean kq = false;
        Connection conn = null;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement();
            String sql = "delete from suppliers where id_supplier = '" + maNCC+"'";
            if (st.executeUpdate(sql) > 0) {
                kq = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return kq;
    }
       public Boolean suaNCC(ET_NhaCungCap et) throws SQLException {
        Boolean kq = false;
        Connection conn = null;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement();
            String sql = "update suppliers "
                    + "set supplier_name = '" + et.getTenNCC()+ "', "
                    + "address = '" + et.getDiaChiNCC()+ "',"
                    + "phone_number = '" + et.getSdtNCC() + "' "
                    + "where id_supplier = '" + et.getMaNCC()+ "'";
            if (st.executeUpdate(sql) > 0) {
                kq = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return kq;
    }
//     public static boolean ShowTextField() {
//         int i = -1;
//         try {
//             Connection con = DatabaseUtil.getConnection();
//             Statement st = con.createStatement();
//             
//         } catch (Exception e) {
//              JOptionPane.showMessageDialog(null, e,"Thong Bao Lo",1);
//         }
//         return (i != -1);
    public String layMaNCC(String tenNCC) throws Exception {
        Connection conn = null;
        conn = DatabaseUtil.getConnection();
        ResultSet rs = null;
        Statement st = conn.createStatement();
        String sql = "select * from suppliers where supplier_name ='" + tenNCC + "' limit 1";
        rs = st.executeQuery(sql);
        String ma = "";
        while (rs.next()) {
            ma = (String) rs.getObject(1);
            break;
        }
        return ma;
    }
}
