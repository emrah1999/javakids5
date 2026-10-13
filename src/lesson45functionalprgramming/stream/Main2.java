package lesson45functionalprgramming.stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        numbers.stream().filter(x->{
            System.out.println("Filtering: " + x);
            return x > 3;
        }).forEach(number -> System.out.println("Number: " + number));

        Map<String,String> maps=new HashMap<>();
        maps.put("1","one");
        maps.put("2","two");

        maps.entrySet().stream().forEach(entry->{
            System.out.println("Key: "+entry.getKey());
            System.out.println("Value: "+entry.getValue());
        });


        numbers.stream().filter(x->x>5).forEach(System.out::println);
    }
}
