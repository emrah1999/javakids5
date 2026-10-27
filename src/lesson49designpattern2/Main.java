package lesson49designpattern2;

public class Main {
    public static void main(String[] args) {

        Payment payment = new PaymentAdapter(new OldPayment());
        payment.pay(100);
    }
}
