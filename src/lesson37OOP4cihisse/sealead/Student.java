package lesson37OOP4cihisse.sealead;

public non-sealed class Student extends Person implements Doable {
    @Override
    public void doSomething() {
        System.out.println("Student is doing something.");
    }
}
