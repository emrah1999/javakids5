package lesson35OOP2cihisse;

public class Main2 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        AnimalSound animalSound = new AnimalSound();
        animalSound.makeAnimalSound(dog); // Output: Woof
        animalSound.makeAnimalSound(cat); // Output: Meow

    }
}
