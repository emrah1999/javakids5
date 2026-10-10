package lesson44functionalprogramming;

public class Main2 {
    public static void main(String[] args) {


        Doable d = ()-> System.out.println("Hello World");

        d.doit();


        metod(food-> System.out.println("I like " + food));



    }
    public static void metod(Doable2 d){
        d.doit("Pizza");
    }
}
