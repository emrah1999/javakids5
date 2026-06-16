package lesson20String3;

public class Main {
    public static void main(String[] args) {
        float a=4F;
        float b=3F;
        System.out.printf("%.2f",a/b);

        System.out.println("&&&&&&&&&&&");
        System.out.printf("Salam %s  necesen ? %d %d" ,"Ali Mustafazade",5,4);
        String format=String.format("Salam %s  necesen ? %d %d" ,"Ali Mustafazade",5,4);
        System.out.printf(format);

        String qiymet=String.format("Qiymet: %.2f", 3.1415926);
        System.out.println(qiymet);
    }
}
