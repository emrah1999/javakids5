package lesson52JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Main3 {
    public static void main(String[] args) {
        JDBCConnection jdbcConnection=JDBCConnection.getInstance();

        Connection connection = JDBCConnection.getConnection();
        try {
            String sql="insert into users(name,surname,username,birthday,is_active) " +
                    "values(?,?,?,?,?)";
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setString(1,"Ali");
            preparedStatement.setString(2,"Veli");
            preparedStatement.setString(3,"aliveli");
            preparedStatement.setString(4,"1990-01-01");
            preparedStatement.setBoolean(5,true);
            int affectedRows=preparedStatement.executeUpdate();
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
