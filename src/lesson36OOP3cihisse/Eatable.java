package lesson36OOP3cihisse;

public interface Eatable {
    void eat(String food);
    default void metod() {
        System.out.println("Metod something");
    }
    static void staticMetod() {
        System.out.println("Static metod something");
    }
}
