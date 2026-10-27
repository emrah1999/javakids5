package lesson49designpattern2;

public class Main3 {
    public static void main(String[] args) {
        YoutubeChannel channel = new YoutubeChannel();

        Subscriber subscriber1 = new Subscriber("Rafiq");
        Subscriber subscriber2 = new Subscriber("Eli");
        Subscriber subscriber3 = new Subscriber("Emin");

        channel.subsribe(subscriber1);
        channel.subsribe(subscriber2);
        channel.subsribe(subscriber3);

        channel.uploadVideo("Design Patterns in Java");
    }
}
