package lesson49designpattern2;

public class Subscriber implements ObserverYoutube {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void upgrade(String message) {
        System.out.println(name + " received upgrade notification: " + message);
    }
}
