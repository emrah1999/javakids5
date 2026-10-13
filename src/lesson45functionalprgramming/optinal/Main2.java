package lesson45functionalprgramming.optinal;


import java.util.ArrayList;
import java.util.Optional;

public class Main2 {
    public static void main(String[] args) {
        Optional<String> list = Optional.of("Alu");

       String s=list.map(String::toUpperCase).orElse("Default Value");
        System.out.println(s);



    }
}
