package lesson44functionalprogramming;

import java.util.Comparator;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        List<Customer> customers = new java.util.ArrayList<>(List.of(
                new Customer("Alice", 30),
                new Customer("Bob", 25),
                new Customer("Charlie", 35)
        ));


//        customers.sort(
//                (c1,c2) -> Integer.compare(c1.age,c2.age)
//        );
//

        customers.sort(Comparator.comparing(Customer::getAge));
        customers.forEach(System.out::println);

    }
}
