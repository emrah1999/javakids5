package lesson39Exception;

public class Main4 {
    public static void main(String[] args) {
        int a=4,b=0;
        int[] arr = {1,2,3};

        try {
            System.out.println(a/b);
            System.out.println(arr[3]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Runtime Exception: " + e.getMessage());
        }

        try {
            String s=null;
            System.out.println(s.length());
        }catch (NullPointerException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
