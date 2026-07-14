package lesson28method2;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int n=6;
        int[] arr=new int[n+1];
        fibonacci(n,arr);
        System.out.println(Arrays.toString(arr));

    }
    static void fibonacci(int n,int[] arr){

        if(n==0){
            arr[0]=0;
            return;
        }
        if(n==1){
            arr[1]=1;
            return;
        }
        fibonacci(n-1,arr);
        arr[n]=arr[n-1]+arr[n-2];
        System.out.println(Arrays.toString(arr));
    }

    //fibonacci(6,arr)
    //fibonacci(5,arr)
    //fibonacci(4,arr)
    //fibonacci(3,arr)
    //fibonacci(2,arr)
    //fibonacci(1,arr)
    //fibonacci(0,arr)


}
