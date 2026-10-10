package lesson44functionalprogramming;

import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Arif", "David", "Eve");

        names.stream()
        .filter(name->name.startsWith("A")).
                map(name->name.toUpperCase()).forEach(System.out::println);

        names.stream().sorted().forEach(System.out::println);

    }
}
