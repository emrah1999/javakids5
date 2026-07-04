package Lesson25ClassAndObject2;

public class Driver extends Person{
    public void drive(){
        System.out.println("Driver is driving");
        super.name="Rafiq";
        super.introduce();
    }
    public  Driver(){
        super("John", "Doe");
    }
}
