package lesson52JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Main4 {
    public static void main(String[] args) {
        JDBCConnection jdbcConnection=JDBCConnection.getInstance();

        Connection connection = JDBCConnection.getConnection();
        try {
            String sql="create table if not exists  users2(id int primary key auto_increment," +
                    "name varchar(50) not null)";
            Statement statement=connection.createStatement();
            int affectedRows=statement.executeUpdate(sql);
            if (affectedRows>0){
                System.out.println("Tablo oluşturuldu");
            }



        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
