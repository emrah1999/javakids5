package lesson4;

public class Main2 {
    public static void main(String[] args) {
        int a=2;
        double b=6;

        if(a==b){
            System.out.println("a ve b beraberder");
        }else if(a>b){
            System.out.println("a b-den boyukdur");
        }else{
            System.out.println("a b-den kicikdir");
        }

        switch (a){
            case 1: {
                System.out.println("a deyisheni 1-e beraberdir");
                break;
            }
            case 2: {
                System.out.println("a deyisheni 2-e beraberdir");
                break;
            }
        }
    }
}
