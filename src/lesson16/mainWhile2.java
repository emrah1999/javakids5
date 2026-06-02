package lesson16;

import java.util.Scanner;

public class mainWhile2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eded = sc.nextInt();
        while (eded != 0 ) {
            System.out.println("Daxil etdiniz: " + eded);
            eded = sc.nextInt();
        }

    }
}
