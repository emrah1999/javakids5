package lesson28method2;

public class Calc {
    public void sum(int a, int b) {
        a=a+5;
        System.out.println("Sum: " + (a + b));
    }
    public void adDeyish(User user){
        user.name="Ali";
    }
    public void adDeyish2(User user){
        user=new User();
        user.name="Ali";
    }
}
