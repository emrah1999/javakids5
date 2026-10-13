package lesson45functionalprgramming.optinal;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> optinal = Optional.of("Hello");

        Optional<String> emptyOptional = Optional.empty();

        Optional<String> nullableOptional = Optional.ofNullable(null);

        System.out.println("Optional value: " + optinal.get());
        if(nullableOptional.isPresent()){
            System.out.println("Nullable Optional value: " + nullableOptional.get());
        } else {
            System.out.println("Nullable Optional is empty");
        }

        nullableOptional.ifPresent(System.out::println);

        String value = nullableOptional.orElse("Default Value");
        System.out.println("Value from nullableOptional or default: " + value);

        String val= nullableOptional.orElseGet(() -> "Generated Default Value");
        System.out.println("Value from nullableOptional or generated default: " + val);

        nullableOptional.orElseThrow(()->new RuntimeException("Value is not present in nullableOptional"));

    }
}
