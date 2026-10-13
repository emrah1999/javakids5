package lesson45functionalprgramming.methodrefrence;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main2 {
    public static void main(String[] args) {
        String str = "Hello World";
//        System.out.println(str.toUpperCase());

        Supplier<String> supplier = str::toLowerCase;

        System.out.println(supplier.get());



        Function<String,String> function = String::toUpperCase;

        System.out.println(function.apply(str));
        System.out.println(function.apply(str));


       Supplier<String> strgnw=String::new;



    }
}
