package lesson12operotr2;

public class Main2 {
    public static void main(String[] args) {
        int a=9;
        int b=6;
        System.out.println(a>b);
        System.out.println(a==b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(a!=b);

        if(a>b){
            System.out.println(a+" "+b+" ededinden boyukdur");
        }else if(a<b){
            System.out.println(a+" "+b+" ededinden kicikdir");
        }else{
            System.out.println(a+" "+b+" ededleri beraberdir");
        }

    }
}
