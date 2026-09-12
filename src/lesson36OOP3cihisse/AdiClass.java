package lesson36OOP3cihisse;

public class AdiClass implements Interface1, Interface2 {


    @Override
    public void metod1() {
        Interface1.super.metod1();
        Interface2.super.metod1();
    }
}
