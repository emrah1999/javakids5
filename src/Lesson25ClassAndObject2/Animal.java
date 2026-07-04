package Lesson25ClassAndObject2;

public class Animal {
    String name;
    String color;
    public Animal(String name){
        System.out.println("Animal name is: " + name);
    }
    public Animal(String name, String color){
        this.name=name;
        this.color=color;
    }
    public Animal(int  age){
        System.out.println("Animal name is: No name");
    }
    public Animal(){
        this("tom");
        this.info();
        System.out.println("Animal name is: No name");
    }
    public void info(){

    }
}
