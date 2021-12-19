/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_connection.DatabaseUtil;
import javax.swing.JOptionPane;

/**
 *
 * @author dthan
 */
public class DAL_ThongKe {

    public ResultSet muonNhieu() throws SQLException {
        ResultSet rs = null;
        Connection conn = null;

        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String sql = "SELECT COUNT(rental_detail.id_book) as 'SoLanMuon', books.id_book , books.title, categories.name, languages.name "
                    + "FROM books, categories,languages, rental_detail "
                    + "WHERE books.id_category = categories.id_category AND books.id_language = languages.id_language AND books.id_book = rental_detail.id_book "
                    + "GROUP BY rental_detail.id_book "
                    + "ORDER BY COUNT(rental_detail.id_book) DESC LIMIT 5";
            rs = st.executeQuery(sql);
        } catch (Exception ex) {
            Logger.getLogger(DAL_ThongKe.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public ResultSet muonNhieuNhatThang() throws SQLException {
        ResultSet rs = null;
        Connection conn = null;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String sql = "SELECT MONTH(rental_detail.borrowed_date) AS 'Thang', COUNT(rental_detail.id_book) AS 'SoLanMuon' FROM books, categories,languages, rental_detail "
                    + "WHERE books.id_category = categories.id_category AND books.id_language = languages.id_language "
                    + "AND books.id_book = rental_detail.id_book "
                    + "GROUP BY MONTH(rental_detail.borrowed_date) ";
            rs = st.executeQuery(sql);
        } catch (Exception ex) {
            Logger.getLogger(DAL_ThongKe.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public ResultSet docGiaChuaTraSach() throws SQLException {
        ResultSet rs = null;
        Connection conn = null;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String sql = "SELECT readers.id_reader,concat(lastname,' ',firstname) as 'TenDG',books.title, rental_detail.borrowed_date "
                    + "FROM member_card , readers , rental_detail, books "
                    + "WHERE member_card.id_reader = readers.id_reader AND member_card.id_lib_card = rental_detail.id_lib_card "
                    + "AND books.id_book = rental_detail.id_book AND rental_detail.status_borow = 'Đang mượn'";
            rs = st.executeQuery(sql);
        } catch (Exception ex) {
            Logger.getLogger(DAL_ThongKe.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
        public ResultSet docGiaQuaHanTra() throws SQLException {
        ResultSet rs = null;
        Connection conn = null;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            String sql = "SELECT readers.id_reader,concat(lastname,' ',firstname) as 'TenDG',books.title, rental_detail.borrowed_date, rental_detail.return_date, "
                    + "DAY(rental_detail.return_date) - DAY(rental_detail.borrowed_date) AS 'SoNgayMuon', "
                    + "DATEDIFF(NOW(),rental_detail.return_date) AS 'SoNgayQuaHan' FROM member_card , readers , rental_detail, books "
                    + "WHERE member_card.id_reader = readers.id_reader AND member_card.id_lib_card = rental_detail.id_lib_card "
                    + "AND books.id_book = rental_detail.id_book AND DATEDIFF(NOW(),rental_detail.return_date) > 0";
            rs = st.executeQuery(sql);
        } catch (Exception ex) {
            Logger.getLogger(DAL_ThongKe.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
}
