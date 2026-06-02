package lesson16;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <10; i++) {
            System.out.println(i+" sira");
        }


        for (int i = 0,j=10; i <j; i++,j--) {
            System.out.println(i+" sira "+j);
        }

        for (int i = 0; i < 20; i++) {
            if(i%2==0) {
                System.out.println(i + " cut eded");
            }
        }
    }
}
