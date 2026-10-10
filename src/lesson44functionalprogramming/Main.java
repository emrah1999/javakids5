package lesson44functionalprogramming;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(36);
        numbers.add(23);
        numbers.add(44);

        for (Integer number : numbers) {
           if(number % 2 == 0) {
               System.out.println(number);
           }
        }

        numbers.stream()
                .filter(number->number % 2==0).toList().forEach(System.out::println);

    }
}
