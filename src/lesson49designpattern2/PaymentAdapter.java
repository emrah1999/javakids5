package lesson49designpattern2;

public class PaymentAdapter implements Payment {
    private OldPayment oldPayment;

    public PaymentAdapter(OldPayment oldPayment) {
        this.oldPayment = oldPayment;
    }

    @Override
    public void pay(int amount) {
        oldPayment.pay(amount);
    }
}
