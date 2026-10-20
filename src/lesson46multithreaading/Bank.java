package lesson46multithreaading;

import java.util.concurrent.locks.ReentrantLock;

public class Bank {
    Double balance;

    private final ReentrantLock lock = new ReentrantLock();

    public Bank(Double balance) {
        this.balance = balance;
    }

    public synchronized void withDraw(Double amount){
        this.balance -= amount;

        System.out.println("Balance: " + balance);
    }
    public  void withDraw2(Double amount) throws InterruptedException {
        synchronized (this){
            this.balance -= amount;

        }

        System.out.println("Balance: " + balance);
    }
    public  void withDra3(Double amount){
        lock.lock();
        try
        {
            this.balance -= amount;
        } finally {
            lock.unlock();
        }
    }



}
