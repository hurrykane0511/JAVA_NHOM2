/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import et.ET_DocGia;
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
public class DAL_DocGia {
    
    public Boolean themDocGia(ET_DocGia et) throws SQLException, Exception {
        Boolean kq = false;
        Connection conn = null;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement();
            String sql = "insert into readers (id_reader, firstname,lastname, birthday,gender,id_card,address,status) "
                    + "values ('" + et.getMaDocGia()+ "','" + et.getHo()+ "','" + et.getTen()+ "','" + new java.sql.Date(et.getNgaySinh().getTime())+ "','" + et.getGioiTinh()+ "','" + et.getCccd()+"','" + et.getDiaChi()+ "'," + et.getTrangThai()+")";
            if (st.executeUpdate(sql) > 0) {
                kq = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        //conn.close();
        return kq;
    }
    
    public Boolean checkTT(String cccd) throws SQLException, Exception {
         Connection conn = null;;
        ResultSet rs = null;
        int row = 0;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql = "Select * from readers where id_card =" + cccd + " and status = 1";
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
    public Boolean xoaThe(ET_DocGia et) throws SQLException {
        Boolean kq = false;
        Connection conn = null;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement();
            String sql = "update readers "
                    + "set status = 0 "
                    + "where id_reader ='" + et.getMaDocGia() + "'";
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
