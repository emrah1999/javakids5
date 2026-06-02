package lesson16;

public class MainWhile {
    public static void main(String[] args) {
        int a=1;
        int cem=0;
        while (a<50){
           if((a%2)!=0){
               cem+=a;
           }
           a++;
        }
        System.out.println("Cem "+cem);


        int b=100;
        while (b>0){
            System.out.println(b);
            b-=10;
        }


    }
}
