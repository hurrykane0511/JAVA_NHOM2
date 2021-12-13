/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;
import et.ET_Sach;
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
public class DAL_CapNhatSach {
    
    //lấy danh sách sách
    public ResultSet layDSSach() throws SQLException {
        ResultSet rs = null;
        Connection conn = null;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement();
            String sql = "SELECT `id_book`, `title` ,`id_category`, `id_language`, `id_author`, `id_publisher`,`release_year` FROM `books`";
            rs = st.executeQuery(sql);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }
    
    //sửa sách
    public Boolean suaSach(ET_Sach et) throws SQLException {
        Boolean kq = false;
        Connection conn = null;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement();
            String sql = "update books "
                    + "set title = '" + et.getTenSach()+ "', "
                    + "id_category = '" + et.getTheLoai()+ "',"
                    + "id_language = '" + et.getNgonNgu()+ "',"
                    + "id_author = '" + et.getMaTD()+ "',"
                    + "id_publisher = '" + et.getMaNXB()+ "',"
                    + "release_year = '" + et.getNamXB()+ "'"
                    + "where id_book ='" + et.getMaSach()+ "'";
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
