package lesson34OOP1cihisse;

public class Person {
    String name;
    String surname;
    Integer age;

    public Person(String name, String surname, Integer age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public Person() {
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
    }
}
