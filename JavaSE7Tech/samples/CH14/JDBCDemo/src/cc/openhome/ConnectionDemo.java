package cc.openhome;

import java.sql.*;

public class ConnectionDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String jdbcUrl = "jdbc:mysql://localhost:3306/demo";
        String user = "root";
        String passwd = "123456";
        try(Connection conn = 
                DriverManager.getConnection(jdbcUrl, user, passwd)) {
            System.out.printf("資料庫已%s%n", conn.isClosed() ? "關閉" : "開啟");
        } 
    }
}
