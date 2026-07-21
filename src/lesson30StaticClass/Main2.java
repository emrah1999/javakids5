package lesson30StaticClass;

public class Main2 {
    public static void main(String[] args) {
        User user=new User();
        User user1=new User();
        User user2=new User();
        user.name="John";
//        User.count=23;
        int count=User.count;
        System.out.println(user1.count);
        System.out.println(user.count);
        System.out.println(user2.count);
        System.out.println("-------------------");
        System.out.println(user1.name);
        System.out.println(user.name);
        System.out.println(user2.name);

        System.out.println(User.PI);
    }
}
