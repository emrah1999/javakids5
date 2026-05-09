package son8LiteralTipCevirlmesi;

public class Main3 {
    public static void main(String[] args) {
//        short a=-130; //undeflow
        short a=140; //undeflow
        System.out.println("Short a: "+a);
        byte b=(byte) a;
        System.out.println("Byte b: "+b);

        short c=500;
        byte d=(byte) c;
        System.out.println(d);

        int m=231832341;
        short n=(short) m;
        System.out.println(n);

        int aa=Integer.MAX_VALUE;

        int integer=23;

        int d4=4;
        int _f=3;
        int $r=3;
    }
    static void main2(){
    }
}
