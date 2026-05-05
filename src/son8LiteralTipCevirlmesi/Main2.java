package son8LiteralTipCevirlmesi;

public class Main2 {
    public static void main(String[] args) {
        byte a=2;
        short b= a;

        char c='3';
        short s=(short) c;
        System.out.println(s);

        int m=19;
        double d=m;
        System.out.println(d);

        double d2=3.14D;

        int mm=(int) d2;
        System.out.println(mm);


        int g=45;
        int h=25;

        System.out.println((double) g/h);
    }
}
