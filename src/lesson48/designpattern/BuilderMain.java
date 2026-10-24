package lesson48.designpattern;

public class BuilderMain {
    public static void main(String[] args) {
        User user= User.builder().name("Salam").age(23).email("ssjdl.az").build();
        System.out.println(user.getName());
    }
}
