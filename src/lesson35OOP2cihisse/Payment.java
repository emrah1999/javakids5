package lesson35OOP2cihisse;

public interface Payment {
    void pay(double amount);
    private void logPayment(double amount) {
        System.out.println("Payment of " + amount + " has been logged.");
    }
    default void printPaymentMethod() {
        logPayment(0); // Example usage of the private method

    }
}
