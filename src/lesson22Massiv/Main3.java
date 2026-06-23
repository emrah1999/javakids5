package lesson22Massiv;

public class Main3 {
    public static void main(String[] args) {
        int[] arr={21,4,23,5,26,25,24,2};


        int cem=0;
        int cem2=0;
        int max=arr[0]; //max=26
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0){
                cem+=arr[i];
            }
            if(i%2==0){
                cem2+=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println("Max element: "+max);
        System.out.println(cem);
        System.out.println(cem2);
        System.out.println(cem-cem2);
    }
}
