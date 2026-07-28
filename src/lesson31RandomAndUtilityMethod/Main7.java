package lesson31RandomAndUtilityMethod;

import java.util.Arrays;

public class Main7 {
    public static void main(String[] args) {
        int[]   numbers = {1, 2, 3, 4, 5};

        int index=5;
        if(index>=0 && index<numbers.length){
            System.out.println(numbers[index]);
        }else{
            UtilMethod.printError("Index out of bounds: " + index);
        }

        Car car1 = new Car();
        Car car2 = new Car();
        System.out.println(System.identityHashCode(car1));
        System.out.println(System.identityHashCode(car2));

        int[] arr1=new int[5];

        System.arraycopy(numbers, 0, arr1, 1, 3);
        System.out.println(Arrays.toString(arr1));

        String seprator=System.lineSeparator();
        System.out.println("Hello"+seprator+"World");
    }
}
