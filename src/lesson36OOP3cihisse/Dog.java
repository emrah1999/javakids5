package lesson36OOP3cihisse;

public class Dog extends Animal{
    @Override
    public Meat eat() {
        return new Meat("Toyuq eti");
    }
}
