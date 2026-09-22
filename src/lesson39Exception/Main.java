package lesson39Exception;

public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=2;
        try {
            int c=a/b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("Eme;iyyat sona catdi.");
        }
    }
}
