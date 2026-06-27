package lesson23;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {98, 34, 43, 4, 5};
        System.out.println(Arrays.toString(numbers));
//        System.out.print("[");
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i]+",");
//        }
//        System.out.println("]");

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int index=Arrays.binarySearch(numbers, 34);
        System.out.println("index of 34 is: "+index);

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };


        System.out.println(Arrays.deepToString(matrix));

        int[] massiv=new int[10];
        Arrays.fill(massiv, 5,8,7);
        System.out.println(Arrays.toString(massiv));

        Car[] cars={new Car("Toyota"),new Car("Hundayi"),new Car("Bmw")};
    }
}
