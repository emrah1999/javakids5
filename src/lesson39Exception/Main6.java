package lesson39Exception;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        try (Scanner scanner = new Scanner(System.in)) {
            int reqem = scanner.nextInt();
            System.out.println("You entered: " + reqem);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }


        try (MyClass myClass = new MyClass();Scanner scanner = new Scanner(System.in)) {

            myClass.doSomething();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
