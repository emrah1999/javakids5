package lesson9;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.name = "Eli";

        user.metod(5);

        int Class = 1;

        int a = 5 + 6;
        int a1=5+6;


        user = null;
        try {
            System.out.println(user.name);
        } catch (NullPointerException exception) {
            System.out.println("Null olan obyekt myraciet");
        }
    }
}
