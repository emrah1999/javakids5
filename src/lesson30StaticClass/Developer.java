package lesson30StaticClass;

public class Developer {
    String name;
    String surname;

    public Developer(){
        System.out.println("Developer class constructor");
    }
    public Developer(String name, String surname){
        this.name=name;
        this.surname=surname;
    }
}
