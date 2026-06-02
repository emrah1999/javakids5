package lesson16;

public class Main2 {
    public static void main(String[] args) {
        int cem=0;

        for (int i = 0; i < 50; i++) {
            if(i%2!=0){
                cem+=i;
            }
        }
        System.out.println("Cem "+cem);

        int hasil=1;

        for (int i = 1; i < 10; i++) {
            hasil*=i;
        }
        System.out.println("Hasil "+hasil);

    }
}
