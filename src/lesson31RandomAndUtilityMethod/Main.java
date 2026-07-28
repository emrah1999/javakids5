package lesson31RandomAndUtilityMethod;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber=random.nextInt();
        System.out.println("Random number: " + randomNumber);

        int randomNumber2=random.nextInt(10);
        System.out.println("Random number between 0 and 9: " + randomNumber2);

        double randomDouble=random.nextDouble();
        System.out.println("Random double between 0.0 and 1.0: " + randomDouble);
    }
}
