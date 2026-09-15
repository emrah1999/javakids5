package lesson37OOP4cihisse.covarianttype;

public class Dog extends Animal {
    @Override
    public Dog get() {
        return new Dog();
    }
}
