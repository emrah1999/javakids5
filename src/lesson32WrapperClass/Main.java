package lesson32WrapperClass;

public class Main {
    public static void main(String[] args) {
        int a=5;
        Integer b=Integer.valueOf(a);
        System.out.println("Value of b: " + b);
        int c=b.intValue();
        Integer m=a;

        Byte t=4;
        byte j=t.byteValue();

        String eded="25";
        int reqem=Integer.parseInt(eded);
        System.out.println("Value of reqem: " + reqem);

        int g=65;

        System.out.println(Integer.toString(g));

        int f;
        Integer h = null;
//        System.out.println(f);
        System.out.println(h);
    }
}
