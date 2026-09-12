package lesson36OOP3cihisse;

public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.eat("algae");
        fish.swim();
        fish.metod();

        Lion lion = new Lion();
        lion.eat("meat");
        lion.run();
        lion.voit();
        lion.metod();

        Eatable.staticMetod();
    }
}
