package lesson17;

public class Main3Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            if((i%3)==0){
                continue;
            }


        }

        System.out.println("*************");
        int eded=0;
        while (eded<20){
            eded++;
            if(eded%4==0){
                continue;
            }

            System.out.println(eded);

        }

    }
}
