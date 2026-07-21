package lesson30StaticClass;

import java.util.Random;

public class MathClass {
    public static void main(String[] args) {
        int subtractExact=Math.subtractExact(5,3);
        System.out.println(subtractExact);
        int sum=Math.addExact(5,3);
        System.out.println(sum);

        double eded=Math.sqrt(16);
        System.out.println(eded);

        double eded2=Math.pow(2,3);
        System.out.println(eded2);

        System.out.println(Math.PI);
        System.out.println(Math.abs(-5));

        System.out.println("-------");
        double eded4=4.5;

        System.out.println(Math.floor(eded4));
        System.out.println(Math.ceil(eded4));
        System.out.println(Math.round(eded4));

        System.out.println(Math.random());

        Random random=new Random();
        System.out.println(random.nextInt(100));
        System.out.println(random.nextInt(60-50+1)+50);

    }
}
