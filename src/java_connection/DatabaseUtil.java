/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author yushu
 */
public class DatabaseUtil {

    public static Connection c;
    private static String db_url = "jdbc:mysql://localhost:3306/qltv?characterEncoding=utf8&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static String username = "root";
    private static String password = "";

    public static Connection getConnection() throws Exception {
        if (c == null) {
            Class.forName("com.mysql.cj.jdbc.Driver");// 
            c = DriverManager.getConnection(db_url, username, password);
        }
        return c;
    }
}
