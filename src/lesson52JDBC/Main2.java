package lesson52JDBC;

import java.sql.Connection;
import java.sql.Statement;

public class Main2 {
    public static void main(String[] args) {
        JDBCConnection jdbcConnection=JDBCConnection.getInstance();

        Connection connection = JDBCConnection.getConnection();
        try {
            String sql="insert into users(name,surname,username,birthday,is_active) " +
                    "values('Emrah','Kaya','emrahkaya','1990-01-01',true)";
            Statement statement=connection.createStatement();
            int affectedRows=statement.executeUpdate(sql);
            if (affectedRows>0){
                System.out.println("Kayıt eklendi");
            }else{
                System.out.println("Kayıt eklenemedi");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
