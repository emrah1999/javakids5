package lesson27Methods;

public class Main3 {
    public static void main(String[] args) {
        TwoClass twoClass = new TwoClass();
        String name="John";
        twoClass.info(name);
        twoClass.info(5);
        twoClass.info("Doe",34);
        twoClass.info(34,"Dow");
        System.out.println(name);
    }
}
