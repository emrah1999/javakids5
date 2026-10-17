package lesson46multithreaading;

public class Bank {
    Double balance;

    public Bank(Double balance) {
        this.balance = balance;
    }

    public synchronized void withDraw(Double amount){
        this.balance -= amount;

        System.out.println("Balance: " + balance);
    }
    public  void withDraw2(Double amount){
        synchronized (this){
            this.balance -= amount;

        }

        System.out.println("Balance: " + balance);
    }


}
