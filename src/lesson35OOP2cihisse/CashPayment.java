package lesson35OOP2cihisse;

public class CashPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using cash.");
    }
}
