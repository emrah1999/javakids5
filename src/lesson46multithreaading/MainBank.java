package lesson46multithreaading;

public class MainBank {
    public static void main(String[] args) {
        Bank bank= new Bank(1000.0); //banka 1000 manat pul qoyduq


        BankThread[] bankThread1 = new BankThread[1000];
         // min olculus bankThreadin massiv yaratdiq




        for (int i = 0; i < bankThread1.length; i++) {
            bankThread1[i] = new BankThread(bank);
            bankThread1[i].start();
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Balance: " + bank.balance);
    }
}
