package lesson39SolidvsException.exception;

public class Main {
    public static void main(String[] args) {
        int a=10;
        int b=3;
        int[] arr = {3,4,63};
        try
        {
            System.out.println(a/b);
            System.out.println(arr[5]);
        }catch (ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed.");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Array index is out of bounds.");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        catch (RuntimeException e){
            System.out.println("Error: A runtime exception occurred.");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("sdsdsd");
    }
}
