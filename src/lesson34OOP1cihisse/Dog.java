package lesson34OOP1cihisse;

public class Dog extends Animal{
    public Dog(){
    }
    String color;

    @Override
    public void printInfo(int a){
        System.out.println("Color: " + color);
        super.printInfo(a);
    }
}
