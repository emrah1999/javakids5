package lesson37OOP4cihisse.covarianttype;

public class BClass extends AClass {
    @Override
    public Dog getAnimal() {
        return new Dog();
    }
}
