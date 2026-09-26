package lesson40Praktika;

public class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        setBalance(initialBalance);
    }

    public void setBalance(double amount) {
        if (amount <= 0) {
            throw new InsufficeintBalanceException("Deposit amount must be positive.");
        }
        this.balance += amount;
    }
    public double getBalance() {
        return balance;
    }
}
