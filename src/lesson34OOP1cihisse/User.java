package lesson34OOP1cihisse;

public class User {
    public String name;
    public String email;
    public Address address;

    public User(){

    }

    public User(String name,String email){
        this.name=name;
        this.email=email;
        this.address=new Address("Moscow","Lenina 1","Lenina");
    }

    public User(String name, Address address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }
}
