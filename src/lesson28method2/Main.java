package lesson28method2;

public class Main {
    public static void main(String[] args) {
        say(5);
        int eded=faktorial(5);
        System.out.println(eded);
    }

    public static void say(int n){ //n=5 //n=4 /n=3 /n=2 /n=1 /n=0
        if(n==0){
            return;
        }
        System.out.println(n);
        say(n-1);
    }

    static int faktorial(int n){
        if(n==1){  // base case
            return 1;
        }
        return n*faktorial(n-1); // 5*24

        //n=5  -> 5*24 ==120
        //n=4  -> 4*6
        //n=3  -> 3*2
        //n=2  -> 2*1
    }

    static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
