package lesson34OOP1cihisse;

public class Teacher extends Person {
    String branch;
    public Teacher(){
        super();
    }

    public Teacher(String name, String surname, Integer age, String branch) {
        super("Eli","Smith", 30);
        this.branch = branch;
        super.name=name;
        super.printInfo();
    }




}
