/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java_connection.DatabaseUtil;
import et.ET_TraSachh;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author dthan
 */
public class DAL_TraSachh {

    private Connection conn;

    public DAL_TraSachh() throws Exception {
        conn = DatabaseUtil.getConnection();
    }

    public ResultSet layTraSach() throws SQLException {
        Statement st = conn.createStatement();
        String sql = "select * from return_detail";
        return st.executeQuery(sql);
    }

    public Boolean themTraSach(ET_TraSachh et) throws SQLException {
        Statement st = conn.createStatement();
        String sql = "insert into return_detail(id_rental_detail, expected_return_date, actually_return_date, id_book, reader, id_lib_card, days_overdue, id_staff, status)"
                + "values(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, et.getMaMuonSach());
            pst.setDate(2, et.getNgayDuTra());
            pst.setDate(3, et.getNgayThucTra());
            pst.setString(4, et.getMaSach());
            pst.setString(5, et.getTenDocGia());
            pst.setString(6, et.getMaThuVien());
            pst.setInt(7, et.getSoNgayQuaHan());
            //pst.setInt(8, et.getTienPhat());
            pst.setString(8, et.getMaNhanVien());
            pst.setString(9, et.getTinhTrangSach());
            if (pst.executeUpdate() > 0) {

                updateQuty(et.getMaSach());
                updatePhieu(et.getMaMuonSach());

            }

        } catch (SQLException ex) {

        }
        return false;
    }

    void updateQuty(String masach) {
        String sql = "update books set reality_quantity = reality_quantity + 1 where id_book = ? ;";
        try {
            PreparedStatement pst1 = conn.prepareStatement(sql);
            pst1.setString(1, masach);
            pst1.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void updatePhieu(int maphieu) {
        String sql = "update rental_detail set status_borow = 'Đã trả' where id_rental_detail = ? ;";
        try {
            PreparedStatement pst1 = conn.prepareStatement(sql);
            pst1.setInt(1, maphieu);
            pst1.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ResultSet timTraSach(String ma) throws SQLException {
        Statement st = conn.createStatement();
        String sql = "select * from rental_detail where id_rental_detail = '" + ma + "' and status_borow = 'Đang mượn'";
        ResultSet rs = null;
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            rs = st.executeQuery(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet layDSNhanVien() throws SQLException, Exception {
        Connection conn = null;
        ResultSet rs = null;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql = "Select id_staff as `MaNV`, concat(lastname,' ',firstname,'-',id_staff) as 'TenNV' from staffs order by id_staff asc";
            rs = st.executeQuery(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }

    public ResultSet layTenDocGia(String madg) throws SQLException, Exception {

        ResultSet rs = null;
        PreparedStatement pst = null;
        String sql = "select concat(firstname,' ',lastname) as 'TenDG' from readers join member_card on readers.id_reader = member_card.id_reader where member_card.id_lib_card = ?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, madg);
            rs = pst.executeQuery();
        } catch (SQLException e) {

        }
        return rs;
    }

//    public ResultSet cbbGetMaSach() throws SQLException {
//        Statement st = conn.createStatement();
//        String sql = "select * from books";
//        return st.executeQuery(sql);
//    }
//    public ResultSet cbbGetMaNV() throws SQLException {
//        Statement st = conn.createStatement();
//        String sql = "select * from staffs";
//        return st.executeQuery(sql);
//    }
}
