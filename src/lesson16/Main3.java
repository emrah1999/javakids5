package lesson16;

public class Main3 {
    public static void main(String[] args) {
        int eded=5496;
        int cem=0;

        while (eded>0){
            int qaliq=eded%10; //qaliq=5
            cem+=qaliq; //cem=6+9+4+5
            eded/=10; //eded=0
        }
        System.out.println(cem);


    }
}
