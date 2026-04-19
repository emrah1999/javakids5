package lesson3;

public class Main {
    public static void main(String[] args) {
        User user1=new User();

        byte v=127; // -128 to 127
        short s=32767; // -32768 to 32767
        int a=5; // -2_147_483_648 to 2_147_483_647
        long l=5L; // -9_223_372_036_854_775_808 to 9_223_372_036_854_775_807

        double b=5.5;
        float f=5.4F;

        long m=322_34_2423_4234_234234L;
        System.out.println(m);
        char c='A';
        boolean isTrue=true;

        String vv="SS";
    }
}
