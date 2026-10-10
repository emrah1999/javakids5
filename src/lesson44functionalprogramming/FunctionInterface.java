package lesson44functionalprogramming;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionInterface {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (n) -> n % 2 == 0;

        System.out.println(isEven.test(4)); // true
        System.out.println(isEven.test(5)); // false

        Consumer<String> printUpperCase = (s) -> System.out.println(s.toUpperCase());

        printUpperCase.accept("Rafiq");

        Function<String, Integer> stringIntegerFunction = (s) -> s.length();

        System.out.println(stringIntegerFunction.apply("Rafiq")); // 5

        Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println(randomSupplier.get()); // Random number between 0.0 and 1.0
    }
}
