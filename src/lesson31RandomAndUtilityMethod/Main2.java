package lesson31RandomAndUtilityMethod;

import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 7;
        int max = 20;

        int randomNumber = random.nextInt(max - min + 1) + min;
        // 6 -> 0-5 //  15

        int randomNumber2=random.nextInt(14); //0-11
    }
}
