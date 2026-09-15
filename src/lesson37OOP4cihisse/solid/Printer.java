package lesson37OOP4cihisse.solid;

public class Printer implements Doable, Eatable {
    @Override
    public void print() {
        System.out.println("Printing...");
    }

    @Override
    public void eat() {
        System.out.println("Printer cannot eat.");
    }
}
