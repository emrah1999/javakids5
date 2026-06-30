package lesson24ClassandObject;


public class Main {
    public static void main(String[] args) {
        int age;
        User user = new User();
        User user2 = new User();
        User user3 = new User("John");
        User user4 = new User("John","sdasd");
        user2.salary=1000;
        System.out.println(user.age);
        System.out.println(user.name);

        user.printInfo();
        user2.printInfo();
        user3.printInfo();
        user4.printInfo();

        User user1=null;;
//        user1.salary=1000;

    }
}
