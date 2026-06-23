package lesson22Massiv;

public class Main4 {
    public static void main(String[] args) {
        int[] arr={4,21,5,26,23,25,24,2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]>arr[j]){ //i=21 j=4
                    int copy=arr[i]; //copy
                    arr[i]=arr[j];
                    arr[j]=copy;
                }
            }

        }
        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));

    }
}
