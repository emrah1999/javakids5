package lesson23;

public class Calculate {
    public void sum(int... arr) {
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        System.out.println("Sum: " + sum);
    }
    public void sum(String name,String surname,int... arr) {
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        System.out.println("Sum: " + sum);
    }
    public void sum(int a,int b){
        System.out.println("Sum 2 "+(a+b));
    }

    public void sum2(int[] arr){
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        System.out.println("Sum: " + sum);
    }
}
