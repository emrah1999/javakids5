package lesson19String;

public class Main5 {
    public static void main(String[] args) {
        String s1="Java";
        String s2="Java";
        if(s1==s2){
            System.out.println("Beraberdir");
        }else{
            System.out.println("Beraber deyil");
        }
        String s3=new String("Java");
        String s4=s3.intern();
        if(s1==s4){
            System.out.println("Beraberdir");
        }else{
            System.out.println("Beraber deyil");
        }
    }
}
