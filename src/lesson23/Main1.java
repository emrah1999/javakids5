package lesson23;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        int[] numbers1 = {2, 5, 6};
        int[] numbers2 = {2, 4, 6};
        if(Arrays.equals(numbers1, numbers2)){
            System.out.println("Beraberdir");
        }else{
            System.out.println("Beraber deyil");
        }

        int[] numbers3=Arrays.copyOf(numbers1, 4);
        int[] numbers4=Arrays.copyOfRange(numbers1, 1,2);
        System.out.println(Arrays.toString(numbers3));
        System.out.println(Arrays.toString(numbers4));
    }
}
