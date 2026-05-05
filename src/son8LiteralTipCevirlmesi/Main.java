package son8LiteralTipCevirlmesi;

public class Main {
    public static void main(String[] args) {
        long a=1L;

        float b=344.4F;

        int eded1=2;
        int eded2=2;
        if(eded1==eded2){
            System.out.println("ededler beraberdir");
        }else {
            System.out.println("ededler beraber deyil");
        }

        Integer eded3=300;
        Integer eded4=300; //-128   -  127
        if(eded3==eded4){
            System.out.println("ededler beraberdir");
        }else {
            System.out.println("ededler beraber deyil");
        }
    }
}
