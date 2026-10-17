package lesson46multithreaading;

public class MyThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Start method MyThread");
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}
