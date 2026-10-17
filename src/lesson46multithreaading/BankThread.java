package lesson46multithreaading;

public class BankThread extends Thread {
    Bank bank;

    public BankThread(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
       bank.withDraw(1.0);
    }
}
