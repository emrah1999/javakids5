package lesson35OOP2cihisse;

public class Cat extends Animal implements Eatable {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }
}
