package Lesson25ClassAndObject2;

public class Person {
    String name;
    String surname;
    public void introduce(){
        System.out.println("My name is: " + name + " " + surname);
    }
    public  Person(){

    }
    public Person(String name, String surname){
        this.name=name;
        this.surname=surname;
    }
}
