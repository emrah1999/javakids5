package lesson17;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        int[] arrays={2,1,5,3,1,3};
        int cem=0;
        for (int array: arrays){
            if(array%2!=0){
                cem+=array;;
            }

        }
        System.out.println(cem);


        ArrayList<String> names=new ArrayList<>();
        names.add("Rafiq");
        names.add("Ali");
        names.add("Emil");

        int index=0;

        for (String name: names){

            System.out.println(name);

            index++;
        }
    }
}
