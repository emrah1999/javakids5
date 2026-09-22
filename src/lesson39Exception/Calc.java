package lesson39Exception;

public class Calc {
    public static int divide(int a,int b) throws ArithmeticException {
        if(b==0){
            throw new ArithmeticException("sifira bolmek olmaz.");
        } else {
            return a / b;
        }
    }
}
