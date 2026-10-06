package lesson43collections3.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Emin");
        list.add("Ali");
        list.add("Veli");
        list.add("Ayşe");
        list.add("Fatma");
        Collections.sort(list);
        System.out.println(list);
        int search= Collections.binarySearch(list,"Ali");
        System.out.println(search);

        Collections.shuffle(list);
        System.out.println(list);
        Collections.fill(list,"Ahmet");
        System.out.println(list);
        int eded=Collections.frequency(list,"Ahmet");
        System.out.println(eded);


        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(Collections.max(list1));
    }
}
