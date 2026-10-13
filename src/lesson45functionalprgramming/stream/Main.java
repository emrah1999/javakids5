package lesson45functionalprgramming.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        numbers.stream().filter(x->x>3).forEach(number -> System.out.println(number));

        int[] arr = {1, 2, 3, 4, 5};

        Arrays.stream(arr).filter(x -> x > 3).forEach(number -> System.out.println(number));

        List<Integer> numbers2=numbers.stream().collect(Collectors.toList());
        List<Integer> numbers4=numbers.stream().toList();
    }
}
