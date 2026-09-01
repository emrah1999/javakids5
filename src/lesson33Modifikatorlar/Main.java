package lesson33Modifikatorlar;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.name = "John";
        user.surname = "Doe";
        user.age= 30;

        System.out.println("Name: " + user.name);
        System.out.println("Surname: " + user.surname);

        User user2=new User("sss","sds");
    }
}
