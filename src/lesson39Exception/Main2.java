package lesson39Exception;

public class Main2 {
    public static void main(String[] args) {
        try {
            int result = Calc.divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e.getMessage());
        }


        try {
            User user = new User();
            user.setName("John Doe");
            user.setAge(15); // This will throw an exception
            System.out.println("User Name: " + user.getName());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }





    }
}
