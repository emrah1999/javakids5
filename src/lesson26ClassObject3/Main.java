package lesson26ClassObject3;

import Lesson25ClassAndObject2.*;

import java.util.*;

import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Kitab kitab1 = new Kitab();
        String name= Oyuncu.name;

        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        Person person1 = new Person("John", "s");

        String name2;

        System.out.println(name);

        Oyuncu oyuncu1 = new Oyuncu();
        System.out.println(oyuncu1.age);
        System.out.println(oyuncu1.price);
        System.out.println(oyuncu1.isActive);
        System.out.println(oyuncu1.type);
        System.out.println(oyuncu1.kitab);

        oyuncu1.info();

        Oyuncu oyuncu2 = null;
        System.out.println(oyuncu2.age);


    }
}
