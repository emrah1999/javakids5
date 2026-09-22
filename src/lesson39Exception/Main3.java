package lesson39Exception;

public class Main3 {
    public static void main(String[] args) {
        int a=10,b=0;
        try{
            if(b<0){
                throw new IllegalArgumentException("b menfi ola bilmez.");
            }
            int result=a/b;
            System.out.println("Result: "+result);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
