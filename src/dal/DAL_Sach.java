/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java_connection.DatabaseUtil;
import et.ET_Sach;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class DAL_Sach {

    public DAL_Sach() throws Exception {

    }

    public ResultSet layDS() throws SQLException, Exception {
        Connection con = null;
        ResultSet rs = null;
        try {
            con = DatabaseUtil.getConnection();
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql = "select * from books";
            rs = st.executeQuery(sql);
        } catch (SQLException ex) {
           
        }
        return rs;
    }

    public ResultSet laySach(String ten) throws SQLException, Exception {
        Connection con = null;

        String sql = "select * from books where title=?";
        con = DatabaseUtil.getConnection();
        PreparedStatement st = con.prepareStatement(sql);
        st.setString(1, ten);
        return st.executeQuery();
    }

    public boolean themSach(ET_Sach et) throws SQLException, Exception {
        Connection con = null;
        con = DatabaseUtil.getConnection();
        Statement st = con.createStatement();
        String sql = "insert into books(id_book,title,quantity,price,release_year,total_page,id_author,id_publisher,id_category,id_language,reality_quantity)"
                + "values('" + et.getMaSach() + "','" + et.getTenSach() + "','" + et.getSoLuong() + "','" + et.getGia() + "','" + et.getNamXB() + "','" + et.getSoTrang() + "','" + et.getMaTD() + "','" + et.getMaNXB() + "','" + et.getTheLoai() + "','" + et.getNgonNgu() + "',"+et.getsLuongThuc()+")";
        if (st.executeUpdate(sql) > 0) {
            return true;
        }
        return false;
    }

    public boolean suaSach(ET_Sach et) throws SQLException, Exception {
        Connection con = null;
        con = DatabaseUtil.getConnection();
        Statement st = con.createStatement();
        String sql = "UPDATE books"
                + " SET title ='" + et.getTenSach() + "', quantity ='" + et.getSoLuong() + "', price ='" + et.getGia() + "', release_year ='" + et.getNamXB() + "', total_page ='" + et.getSoTrang() + "', id_author ='" + et.getMaTD() + "', id_publisher ='" + et.getMaNXB() + "', id_category ='" + et.getTheLoai() + "', id_language ='" + et.getNgonNgu() + "', reality_quantity="+et.getsLuongThuc()
                + " WHERE id_book='" + et.getMaSach() + "'";
        if (st.executeUpdate(sql) > 0) {
            return true;
        }
        return false;
    }

    public boolean xoaSach(String et) throws SQLException, Exception {
        Connection con = DatabaseUtil.getConnection();
        Statement st = con.createStatement();
        String sql = "DELETE "
                + "FROM books "
                + " WHERE id_book='" + et + "'";
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
            String sql = "Select * from books where id_book = '" + ma + "'";
            rs = st.executeQuery(sql);
            rs.last();
            row = rs.getRow();
            rs.beforeFirst();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        if(row >0){
            return true;
        }
        else{
            return false;
        }
    }

    public String laySLSach(String maSach) throws Exception {
        Connection conn = null;
        conn = DatabaseUtil.getConnection();
        ResultSet rs = null;
        Statement st = conn.createStatement();
        String sql = "select * from books where id_book = '" + maSach + "'";
        rs = st.executeQuery(sql);
        String sl = "";
        while (rs.next()) {
            sl = rs.getObject(3).toString();
        }
        return sl;
    }
    public String laySLSachThucTe(String maSach) throws Exception {
        Connection conn = null;
        conn = DatabaseUtil.getConnection();
        ResultSet rs = null;
        Statement st = conn.createStatement();
        String sql = "select * from books where id_book = '" + maSach + "'";
        rs = st.executeQuery(sql);
        String sl = "";
        while (rs.next()) {
            sl = rs.getObject(12).toString();
        }
        return sl;
    }
    public String layGia(String maSach) throws Exception {
        Connection conn = null;
        conn = DatabaseUtil.getConnection();
        ResultSet rs = null;
        Statement st = conn.createStatement();
        String sql = "select * from books where id_book = '" + maSach + "'";
        rs = st.executeQuery(sql);
        String sl = "";
        while (rs.next()) {
            sl = rs.getObject(4).toString();
        }
        return sl;
    }
    public String layTen(String maSach) throws Exception {
        Connection conn = null;
        conn = DatabaseUtil.getConnection();
        ResultSet rs = null;
        Statement st = conn.createStatement();
        String sql = "select * from books where id_book = '" + maSach + "'";
        rs = st.executeQuery(sql);
        String ten = "";
        while (rs.next()) {
            ten = rs.getObject(2).toString();
        }
        return ten;
    }
}
