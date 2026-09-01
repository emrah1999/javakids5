package lesson33Modifikatorlar;

public class User {
    public String name;
    String surname;
    protected int age;
    private String password;

    private class Sinif{

    }

    public User(String password) {
        this.password = password;
    }
    public User(){
        this(4,"123456");
    }
    private User(int age,String password){
        this.age=age;
        this.password=password;

    }
    User(String name,String surname){
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.password=password;

    }
    protected User(String name,String surname,int age){
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.password=password;

    }
    public User(String name,String surname,int age,String password){
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.password=password;

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private void hesabla(){

    }
}
