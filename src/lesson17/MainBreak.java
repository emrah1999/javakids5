package lesson17;

public class MainBreak {
    public static void main(String[] args) {
        for (int i = 10; i < 30; i++) {
            if(i%6==0){
                System.out.println(i);
                break;
            }
        }
        int i=10;
        while (true){
            if(i%7==0){

                System.out.println("Eded tapildi: "+i);
                break;
            }
            i++;
        }
    }
}
