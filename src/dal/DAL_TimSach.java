/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_connection.DatabaseUtil;
import javax.swing.JOptionPane;

/**
 *
 * @author son2lk
 */
public class DAL_TimSach {

    private Connection conn;

    public DAL_TimSach() throws Exception {
        try {
            conn = DatabaseUtil.getConnection();
        } catch (Exception ex) {
            Logger.getLogger(DAL_TimSach.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet layDSSach(String searchBy, String kw) throws SQLException, Exception {
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement pst = null;
        String sql = "select b.id_book, b.title,ctg.name 'ctg',a.author_name,  p.name 'p_name', lan.name 'lan_name', total_page, price from books b\n"
                + "join authors a on b.id_author = a.id_author\n"
                + "join categories ctg on ctg.id_category = b.id_category\n"
                + "join languages lan on lan.id_language =  b.id_language\n"
                + "join publishers p on p.id_publisher = b.id_publisher "
                + searchBy;
        ;
        try {
            
            conn = DatabaseUtil.getConnection();
            pst = conn.prepareStatement(sql);
            pst.setString(1, kw);
            rs = pst.executeQuery();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }
}
