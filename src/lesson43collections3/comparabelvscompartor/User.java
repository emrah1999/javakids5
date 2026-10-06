package lesson43collections3.comparabelvscompartor;

public class User {
    String name;
    Integer age;
    String surname;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }



    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
