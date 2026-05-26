package lesson14If;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        int c;
        if (a < b) {
            c = a + b;
            System.out.println("a b-den kicikdir");
        } else {
            c = a - b;
            System.out.println("a b-den boyukdur");
        }
        System.out.println(c);


        if (a == b) {
            System.out.println("a b-ye beraberdir");
        } else {
            System.out.println("a b-ye beraberdir deyil");
        }
    }
}
