package lesson36OOP3cihisse;

public class Fish implements Eatable,Swimmable,Doable{


    @Override
    public void eat(String food) {
        System.out.println("Fish is eating " + food);
    }

    @Override
    public void swim() {
        System.out.println("Fish is swimming");
    }

    @Override
    public void voit() {
        System.out.println("Fish is doing something");
    }
}
