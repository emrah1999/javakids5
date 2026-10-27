package lesson48.designpattern;

public class BuilderMain {
    public static void main(String[] args) {
        User user= User.builder().name("Salam").age(23).surname("ssjdl").build();
        System.out.println(user.getName());
    }
}
