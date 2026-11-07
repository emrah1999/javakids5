package lesson52JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
    private static JDBCConnection instance;
    private static Connection connection;
    private JDBCConnection()  {
        String jdbcURL="jdbc:mysql://localhost:3306/javakids5";
        try {
            connection= DriverManager.getConnection(jdbcURL, "root","emrah1907");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static Connection getConnection() {
        return connection;
    }

    public static JDBCConnection getInstance() {
        if (instance == null) {
            instance = new JDBCConnection();
        }
        return instance;
    }
}
