package lesson41.list;

import java.util.ArrayList;
import java.util.Iterator;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(23);
        list2.add(34);
        list2.add(344);
        list2.add(34);
        list2.add(2356);

        System.out.println(list2);
        Iterator<Integer> iterator=list2.iterator();
        while (iterator.hasNext()){
            Integer eded=iterator.next();
            System.out.println(eded);
            if(eded%2==0){
                iterator.remove();
            }
        }
        System.out.println(list2);
    }
}
