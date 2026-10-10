package lesson44functionalprogramming;

public class Main4 {
    public static void main(String[] args) {
        Calculator s=(a,b)->(a+b);
        Calculator s1=(a,b)->(a*b);
        Calculator s2=(a,b)->(a/b);
        Calculator s3=(a,b)->(a-b);
        System.out.println(s.calc(5,10));
        System.out.println(s1.calc(5,10));
        System.out.println(s2.calc(5,10));
        System.out.println(s3.calc(5,10));


        Calculator s4=(a,b)->{
            if(b==0){
                throw new ArithmeticException("Division by zero");
            }else {
                return (a/b);
            }
        };


    }
}
