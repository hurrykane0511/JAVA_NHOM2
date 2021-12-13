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

    // thêm độc giả
    public Boolean themDocGia(ET_DocGia et) throws SQLException, Exception {
        Boolean kq = false;
        Connection conn = null;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement();
            String sql = "insert into readers (id_reader, firstname,lastname, birthday,gender,pid,address,reader_type) "
                    + "values ('" + et.getMaDocGia() + "','" + et.getTen()+ "','" + et.getHo()+ "','" + new java.sql.Date(et.getNgaySinh().getTime()) + "','" + et.getGioiTinh() + "','" + et.getCccd() + "','" + et.getDiaChi() + "'," + et.getloaiDG() + ")";
            if (st.executeUpdate(sql) > 0) {
                kq = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        //conn.close();
        return kq;
    }

    // check tồn tại độc giả
    public Boolean checkTT(String cccd) throws SQLException, Exception {
        Connection conn = null;;
        ResultSet rs = null;
        int row = 0;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql = "Select * from readers where pid ='" + cccd+"'";
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

    // lấy danh sách độc giả
    public ResultSet layDS() throws SQLException, Exception {
        Connection conn = null;;
        ResultSet rs = null;
        int row = 0;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql = "Select * from readers";
            rs = st.executeQuery(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        //conn.close();
        return rs;
    }

    // sửa độc giả
    public Boolean suaDocGia(ET_DocGia et) throws SQLException {
        Boolean kq = false;
        Connection conn = null;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement();
            String sql = "update readers "
                    + "set firstname =  '" + et.getTen() + "',"
                    + "lastname = '" + et.getHo() + "',"
                    + "birthday = '" + et.getNgaySinh() + "',"
                    + "gender = '" + et.getGioiTinh() + "',"
                    + "pid = '" + et.getCccd() + "',"
                    + "address = '" + et.getDiaChi() + " "
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
