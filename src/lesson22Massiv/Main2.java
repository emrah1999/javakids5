package lesson22Massiv;

import lesson18SinifObyektString.Car;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int[] arrays={2,342,34,34,234,234,3};
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
        int[] arrays2=arrays;
        System.out.println(Arrays.toString(arrays));
        System.out.println(Arrays.toString(arrays2));
        arrays2[0]=100;
        System.out.println(Arrays.toString(arrays));
        System.out.println(Arrays.toString(arrays2));

        Car car=null;
        int[] a;

        Arrays.sort(arrays);
        System.out.println(Arrays.toString(arrays));

        Arrays.fill(arrays, 0);
        Arrays.fill(arrays, 0, 3, 1);
        System.out.println(Arrays.toString(arrays));

        for (int arr:arrays2){
            System.out.println(arr);
        }

    }
}
