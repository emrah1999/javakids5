package lesson22Massiv;

public class Main6 {
    public static void main(String[] args) {
        int[][] arr={
                {22,4,3},
                {21,5,26},
                {23,25,24}
        };
        int cem=0;
        int max=arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
                cem+=arr[i][j];
            }
            System.out.println();
        }
        System.out.println("--------------------");
        System.out.println("arr[1][2] = " + arr[1][2]);
        System.out.println("Sum of all elements: " + cem);
    }
}
