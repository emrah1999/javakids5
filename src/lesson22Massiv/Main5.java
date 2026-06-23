package lesson22Massiv;

public class Main5 {
    public static void main(String[] args) {
        int[] array={4,21,5,26,23,25,24,2};
        int count=0;
        int cem=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2!=0){
                cem+=array[i];
                count++;
            }
        }
        System.out.println("Ededi orta: "+(double)cem/count);
    }
}
