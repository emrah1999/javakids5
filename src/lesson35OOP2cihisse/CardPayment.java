package lesson35OOP2cihisse;

public class CardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using card.");
    }
}
