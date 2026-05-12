package lesson9;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.name = "Eli";

        int Class=1;


        user = null;
        try {
            System.out.println(user.name);
        } catch (NullPointerException exception) {
            System.out.println("Null olan obyekt myraciet");
        }
    }
}
