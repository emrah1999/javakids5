package lesson41.list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Rafiq");
        list.add("Emil");
        list.add("Emin");
        list.add("Emin");
        list.add("Eli");
        list.add("Ibrahim");
        System.out.println(list.get(3));
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.remove("Rafiq");

        List<Integer> numbers=new ArrayList<>();
        numbers.add(34);
        numbers.add(35);
        numbers.add(3);
        numbers.add(4);
        numbers.add(4);
        numbers.add(2);

        System.out.println(numbers);

        numbers.remove(3);
        Integer index=3;
        numbers.remove(index);
        System.out.println(numbers);

        numbers.set(2,56);
        System.out.println(numbers);

        System.out.println(numbers.size());

        for (Integer number:numbers){
            System.out.println(number);
        }

    }
}
