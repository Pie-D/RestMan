package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO122 {
    public static Connection connection;

    public DAO122() {
        if (connection == null) {
            String dbUrl = "jdbc:mysql://localhost:3306/restman?autoReconnect=true&useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC";
            String dbClass = "com.mysql.cj.jdbc.Driver"; // Sử dụng lớp trình điều khiển mới

            try {
                Class.forName(dbClass);
                connection = DriverManager.getConnection(dbUrl, "root", "Diepdz123..");
                System.out.println("Connected to the database.");
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("Failed to connect to the database.");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        DAO122 dao = new DAO122(); 
    }
}
