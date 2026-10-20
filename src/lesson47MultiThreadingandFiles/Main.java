package lesson47MultiThreadingandFiles;

public class Main {
    private static volatile boolean running = true;

    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {
            while (running){
                System.out.println("Worker thread is running...");
            }
            System.out.println("Worker thread has stopped.");
        });

        worker.start();

        try {
            Thread.sleep(1000); // Let the worker thread run for 1 second
        } catch (InterruptedException e) {

        }
        running = false; // Stop the worker thread

        worker.join(); // Wait for the worker thread to finish
    }
}
