package lesson46multithreaading;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start method");
        ThreadClass myThread=new ThreadClass();
        myThread.start();


//        Thread thread=new Thread(new MyThread());
//        thread.start();


        Thread thread2=new MyThread2();
        thread2.start();


        System.out.println("End method");
    }
}
