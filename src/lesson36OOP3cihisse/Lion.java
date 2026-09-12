package lesson36OOP3cihisse;

public class Lion implements Eatable,Doable,Runnable{
    @Override
    public void eat(String food) {
        System.out.println("Lion is eating " + food);
    }

    @Override
    public void voit() {
        System.out.println("Lion is doing something");
    }

    @Override
    public void run() {
        System.out.println("Lion is running");
    }
}
