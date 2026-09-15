package lesson35OOP2cihisse;

public class MakePayment {
    public void makePayment(Payment paymentMethod,double amount) {
        if(paymentMethod instanceof CashPayment){
            System.out.println("10% cashback qazandiniz");
        }
        paymentMethod.pay(amount);
    }

}
