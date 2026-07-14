package lesson28method2;

public class Main3 {
    public static void main(String[] args) {
        Calc calc = new Calc();
        int num=5;
        int b=10;
        calc.sum(num, b);
        System.out.println(num);

        System.out.println("***************");

        User user = new User();
        user.name="Emil";
        System.out.println(user.name);
        calc.adDeyish2(user);
        calc.adDeyish(user);
        System.out.println(user.name);
    }
}
