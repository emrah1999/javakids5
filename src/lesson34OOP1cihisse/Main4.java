package lesson34OOP1cihisse;

public class Main4 {
    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "John Doe";
        user1.email="john@gmsil.com";
        Address address1 = new Address();
        address1.city = "New York";
        address1.street = "5th Avenue";
        address1.address = "123 5th Avenue, New York, NY 10001";

        user1.address=address1;

        System.out.println(user1.address.city);

        user1=null;
        System.out.println(address1.city);



        User user2=new User("Rafiq",new Address("Sds","Sd","Sds"),"rafiq@mail.ru");
        user2.address.city="Moscow";


        User user3=new User("Emil","ELiyev");
        user3=null;

    }
}
