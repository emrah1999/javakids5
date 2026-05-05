package son8LiteralTipCevirlmesi;

public class Main3 {
    public static void main(String[] args) {
//        short a=-130; //undeflow
        short a=140; //undeflow
        System.out.println("Short a: "+a);
        byte b=(byte) a;
        System.out.println("Byte b: "+b);
    }
}
