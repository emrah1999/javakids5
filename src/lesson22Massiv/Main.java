package lesson22Massiv;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr={3,45,3,24,32,32};
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
        int[] arr2=new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr2[i]=arr[i];
        }
        arr2[arr2.length-1]=100;
        System.out.println(Arrays.toString(arr2));

        String[] arr3=new String[7];
        System.out.println(Arrays.toString(arr3));

        int[] arr4;



    }

}
