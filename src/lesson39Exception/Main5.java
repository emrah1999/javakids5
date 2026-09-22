package lesson39Exception;

public class Main5 {
    public static void main(String[] args) {
        Bank bank = new Bank();

        try {
            bank.setBalance(-500.0);
        } catch (BalanceException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Error: " + e.getInternalMessage());
        }

    }
}
