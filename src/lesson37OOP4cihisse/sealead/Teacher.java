package lesson37OOP4cihisse.sealead;

public final class Teacher extends Person implements Doable {
    @Override
    public void doSomething() {
        System.out.println("Teacher is doing something.");
    }
}
