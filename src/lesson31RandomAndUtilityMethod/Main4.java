package lesson31RandomAndUtilityMethod;

public class Main4 {
    public static void main(String[] args) {
        System.err.println("Hello World");
        int a=5,b=0;
        if(b>0){
            System.out.println(a/b);
        }else{
            UtilMethod.printError("Division by zero is not allowed.");
        }
    }
}
