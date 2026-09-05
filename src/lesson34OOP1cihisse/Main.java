package lesson34OOP1cihisse;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("John");
        customer.setSurname("Doe");
        customer.setEmail("john@gmail.com");

        System.out.println("Name: " + customer.getName());
        System.out.println("Surname: " + customer.getSurname());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("---------------");

        Customer customer1 = new Customer("Rafiq","rafi1@mail.ru","Eliyev",44);

        System.out.println("Name: " + customer1.getName());
        System.out.println("Surname: " + customer1.getSurname());
        System.out.println("Email: " + customer1.getEmail());
    }
}
