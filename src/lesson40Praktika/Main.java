package lesson40Praktika;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);
        System.out.println("Initial balance: " + account.getBalance());



        System.out.println("Final balance: " + account.getBalance());
    }
}
