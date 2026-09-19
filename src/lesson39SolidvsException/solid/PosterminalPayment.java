package lesson39SolidvsException.solid;

public class PosterminalPayment implements Payment {
    @Override
    public void pay(){
        System.out.println("Paying with posterminal");
    }
}
