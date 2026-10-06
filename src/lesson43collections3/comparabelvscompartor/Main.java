package lesson43collections3.comparabelvscompartor;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("John");
        list.add("Alice");
        list.add("Bob");
        Collections.sort(list);

        ArrayList<User> users = new ArrayList<>();
        users.add(new User("John", 25));
        users.add(new User("Alice", 30));
        users.add(new User("Bob", 20));
        System.out.println(users);
//        Collections.sort(users);
        System.out.println(users);

    }
}
