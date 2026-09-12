package lesson36OOP3cihisse;

public class Class2 implements AdiInterface {
    @Override
    public Dog animal() {
        return new Dog();
    }

    @Override
    public int sum(int a, int b) {
        return 0;
    }
}
