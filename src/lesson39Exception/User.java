package lesson39Exception;

public class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws RuntimeException {
        if(age<18){
            throw new RuntimeException("Age must be 18 or older.");
        }
        this.age = age;
    }
}
