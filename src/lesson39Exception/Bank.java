package lesson39Exception;

public class Bank {
    private Double balance;

    public void setBalance(Double balance) throws BalanceException {
        if(balance<0){
            throw new BalanceException("Balance cannot be negative.","Bu xeta developet unundur");
        }
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }
}
