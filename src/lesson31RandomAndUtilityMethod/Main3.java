package lesson31RandomAndUtilityMethod;

import java.util.Random;

public class Main3 {
    public static void main(String[] args) {

        Random random2 = new Random(42);
        Random random3 = new Random(42);
        System.out.println("Random number with seed 42: " + random2.nextInt(100));
        System.out.println("Random number with seed 42: " + random2.nextInt(100));
        System.out.println("Random number with seed 42: " + random2.nextInt(100));
        System.out.println("Random number with seed 42: " + random2.nextInt(100));
        System.out.println("Random number with seed 42: " + random2.nextInt(100));
        System.out.println("Random number with seed 42: " + random2.nextInt(100));
        System.out.println("Random number with seed 42: " + random2.nextInt(100));
    }
}
