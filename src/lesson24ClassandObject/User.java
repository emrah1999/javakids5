package lesson24ClassandObject;

public class User {
    int age;
    String name;
    String surname;
    double salary;
    boolean isMarried;
    Address address;
    public void run(){
        int age=20;
        printInfo();
    }
    public void printInfo(){
        System.out.println("Name: "+name);
        System.out.println("Surname: "+surname);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
        System.out.println("Is Married: "+isMarried);
    }
    public int getAge(){
        return age;
    }
    public User(){
        String name;
        System.out.println("User class constructor");
    }
    public User(String name){
        this.name=name;
    }
    public User(String name,String surname){
        this.name=name;
        this.surname=surname;
    }
}
