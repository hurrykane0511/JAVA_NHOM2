/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java_connection.DatabaseUtil;
import javax.swing.JOptionPane;
import et.ET_MuonSach;
import java.sql.Date;
import java.sql.PreparedStatement;

/**
 *
 * @author son2lk
 */
public class DAL_MuonSach {

    private Connection conn;

    public DAL_MuonSach() throws Exception {
        conn = DatabaseUtil.getConnection();
    }

    public boolean ChoMuonSach(ET_MuonSach phieu) throws SQLException {

        Statement st = conn.createStatement();
        String sql = "INSERT INTO `qltv`.`rental_detail` (`borrowed_date`, `return_date`, `id_book`, `id_lib_card`, `id_staff`, `status`) VALUES ( ? , ? , ? , ? , ? , ?);";

        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setDate(1, phieu.getNgaymuon());
            pst.setDate(2, phieu.getNgaytra());
            pst.setString(3, phieu.getMasach());
            pst.setString(4, phieu.getMathe());
            pst.setString(5, phieu.getManv());
            pst.setString(6, phieu.getTinhTrang());

            return pst.executeUpdate() > 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }

    public boolean SuaPhieuMuon(ET_MuonSach phieu, String maphieu) throws SQLException {
        Statement st = conn.createStatement();
        String sql = "update rental_detail set borrowed_date = ?, return_date = ?, id_book = ?, id_lib_card = ?, id_staff = ? , `status` = ? where `id_rental_detail` = ? ;";

        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setDate(1, phieu.getNgaymuon());
            pst.setDate(2, phieu.getNgaytra());
            pst.setString(3, phieu.getMasach());
            pst.setString(4, phieu.getMathe());
            pst.setString(5, phieu.getManv());
            pst.setString(6, phieu.getTinhTrang());
            pst.setString(7, maphieu);
            return pst.executeUpdate() > 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }

    public ResultSet LayDG(String madg) throws SQLException, Exception {

        ResultSet rs = null;
        PreparedStatement pst = null;
        String sql = "select concat(firstname,' ',lastname) as 'TenDG' from readers rd join member_card c on rd.id_reader = c.id_reader where c.id_lib_card = ?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, madg);
            rs = pst.executeQuery();
        } catch (SQLException e) {

        }
        return rs;
    }

    public boolean XoaPhieuMuon(String maphieu) throws SQLException {
        Statement st = conn.createStatement();
        String sql = "delete from `rental_detail` where `id_rental_detail` = ? ;";

        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, maphieu);
            return pst.executeUpdate() > 0;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }

    public ResultSet LayDSPhieu() throws SQLException, Exception {
        Connection conn = null;
        ResultSet rs = null;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql = "SELECT id_rental_detail as 'Mã phiếu',\n"
                    + "id_lib_card as 'Mã thẻ', id_staff as 'Mã NV', \n"
                    + "id_book as 'Mã Sách', status as 'Tình trạng sách',\n"
                    + "borrowed_date as 'Ngày mượn', return_date as 'Ngày phải trả'\n"
                    + "FROM qltv.rental_detail order by borrowed_date asc";
            rs = st.executeQuery(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
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

}
