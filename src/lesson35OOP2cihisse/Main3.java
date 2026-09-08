package lesson35OOP2cihisse;

public class Main3 {
    public static void main(String[] args) {
        Payment card=new CardPayment();
        Payment cash=new CashPayment();
        PosterminalPayment posterminalPayment=new PosterminalPayment();

        MakePayment makePayment=new MakePayment();

        makePayment.makePayment(card,100.0);
        makePayment.makePayment(cash,100.0);
        makePayment.makePayment(posterminalPayment,100.0);
        card.printPaymentMethod();
    }
}
