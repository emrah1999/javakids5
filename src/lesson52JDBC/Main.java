package lesson52JDBC;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try{
            JDBCConnection jdbcConnection=JDBCConnection.getInstance();
            String sql="Select * from users where ;";
            Statement statement = JDBCConnection.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                System.out.println("Id:" +resultSet.getInt("id"));
                System.out.println("Name:" +resultSet.getString("name"));
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
