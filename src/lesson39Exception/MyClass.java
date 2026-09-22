package lesson39Exception;

public class MyClass implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("MyClass resources have been released.");
    }
    public void doSomething() {
        System.out.println("Doing something in MyClass.");
    }
}
