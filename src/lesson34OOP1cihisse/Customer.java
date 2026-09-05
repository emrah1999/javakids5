package lesson34OOP1cihisse;

public class Customer {
    private String name;
    private String surname;
    private String email;
    private Integer age;

    public Customer(String name, String email, String surname,Integer age) {
        setEmail(email);
        setName(name);
        setSurname(surname);
        setAge(age);
    }
    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age<0){
            System.err.println("Age cannot be negative");
        }else{
            this.age = age;
        }
    }
}
