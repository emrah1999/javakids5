package lesson43collections3.comparabelvscompartor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("John", 25));
        users.add(new User("Alice", 30));
        users.add(new User("Bob", 20));
        users.add(new User("Bob", 23));
        users.add(new User("Rafiq", 20));
        users.add(new User("Eli", 22));
        users.add(new User("Bob", 24));

        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.age.compareTo(o2.age);
            }
        });
        System.out.println(users);
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.name.compareTo(o2.name);
            }
        });

//        Collections.sort(users, new Comparator<User>() {
//            @Override
//            public int compare(User o1, User o2) {
//                return o1.surname.compareTo(o2.surname);
//            }
//        });

        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                int nameCompare = o1.name.compareTo(o2.name);
                if(nameCompare != 0) {
                    return nameCompare;
                } else {
                    return o1.age.compareTo(o2.age);
                }
            }
        });
        System.out.println(users);


    }
}
