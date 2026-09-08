package lesson35OOP2cihisse;

public class PosterminalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " made through Posterminal.");
    }
}
