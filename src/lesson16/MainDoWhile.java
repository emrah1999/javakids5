package lesson16;

public class MainDoWhile {
    public static void main(String[] args) {
        int a=0;
        int cem=0;
        do {
            System.out.println(a);
            cem+=a;
            a++;

        }while (a<5);
        System.out.println("Cem "+cem);
    }
}
