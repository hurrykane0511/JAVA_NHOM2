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
<<<<<<< HEAD
//import static sun.jvm.hotspot.HelloWorld.e;
=======
>>>>>>> 54f1fb5813bef4660ce5c9075705bf392d890712

/**
 *
 * @author son2lk
 */
public class DAL_MuonSach {

    private Connection conn;

    public DAL_MuonSach() throws Exception {
        conn = DatabaseUtil.getConnection();
    }

//    Hàm Insert Mã phiếp mới
    public boolean ChoMuonSach(ET_MuonSach phieu) throws SQLException {

        String sql = "INSERT INTO `qltv`.`rental_detail` (`borrowed_date`, `return_date`, `id_book`, `id_lib_card`, `id_staff`, `status`) VALUES ( ? , ? , ? , ? , ? , ?);";

        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setDate(1, phieu.getNgaymuon());
            pst.setDate(2, phieu.getNgaytra());
            pst.setString(3, phieu.getMasach());
            pst.setString(4, phieu.getMathe());
            pst.setString(5, phieu.getManv());
            pst.setString(6, phieu.getTinhTrang());

            if (pst.executeUpdate() > 0) {
                String sql2 = "update books set reality_quantity = reality_quantity - 1 where id_book = ? ;";
                try 
                {
                    PreparedStatement pst1 = conn.prepareStatement(sql2);
                    pst1.setString(1, phieu.getMasach());
                    pst1.executeUpdate();
                } 
                catch (SQLException ex)
                {
                    JOptionPane.showMessageDialog(null, ex);
                }
                
                return true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }
//    Hàm kiếm số sách đang mượn có vượt qua số lần được mượn của loại tài khỏan
    public ResultSet GetStatus(String mathe) {
        ResultSet rs = null;
        PreparedStatement pst = null;
        String sql = "select distinct count(dt.status_borow) as 'sum', c.expiration_date 'hethan', rt.quantity from member_card c \n"
                + "join readers rd on c.id_reader = rd.id_reader \n"
                + "join reader_type rt on rd.reader_type = rt.type_id \n"
                + "join rental_detail dt on dt.id_lib_card = c.id_lib_card\n"
                + "where c.id_lib_card = ? and dt.status_borow like 'Đang mượn'";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, mathe);
            rs = pst.executeQuery();
        } catch (SQLException e) {

        }
        return rs;
    }
// Hàm lấy số lượng sách hiện có
    public ResultSet GetQtyBook(String masach) {
        ResultSet rs = null;
        PreparedStatement pst = null;
        String sql = "select reality_quantity from books where id_book = ? ;";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, masach);
            rs = pst.executeQuery();
        } catch (SQLException e) {

        }
        return rs;
    }
//    Hàm lây tên độc giả
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
//Hàm Lấy danh sách phiếu
    public ResultSet LayDSPhieu() throws SQLException, Exception {
        Connection conn = null;
        ResultSet rs = null;
        try {
            conn = DatabaseUtil.getConnection();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            String sql = "SELECT * FROM qltv.rental_detail order by id_rental_detail desc";
            rs = st.executeQuery(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }
//Hàm Lấy danh sách phiếu danh sách nhân viên
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
