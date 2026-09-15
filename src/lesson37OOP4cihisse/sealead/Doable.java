package lesson37OOP4cihisse.sealead;

public sealed interface Doable permits Student, Teacher  {
    void doSomething();
}
