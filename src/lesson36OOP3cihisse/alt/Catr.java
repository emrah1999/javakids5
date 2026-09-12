package lesson36OOP3cihisse.alt;

import lesson36OOP3cihisse.Eatable;

public class Catr implements Eatable {
    @Override
    public void eat(String food) {
        System.out.println("Cat is eating " + food);
    }

    @Override
    public void metod() {
        Eatable.super.metod();
    }
}
