package lesson33Modifikatorlar.sub;

import lesson33Modifikatorlar.User;

public class Main2 {
    public static void main(String[] args) {
        User user=new User();
        user.setPassword("123456");
        System.out.println("Password: " + user.getPassword());

    }
}
