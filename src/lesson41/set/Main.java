package lesson41.set;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> numbers=new HashSet<>();

        numbers.add(46);
        numbers.add(78);
        numbers.add(34);
        numbers.add(5);
        numbers.add(70);
        numbers.add(32);
        numbers.add(2);
        System.out.println(numbers.size());
        System.out.println(numbers);

        TreeSet<Integer> trees=new TreeSet<>();

        trees.add(46);
        trees.add(78);
        trees.add(34);
        trees.add(5);
        trees.add(70);
        trees.add(32);
        trees.add(2);
        System.out.println(trees);

        TreeSet<String> list=new TreeSet<>();
        list.add("Rafiq");
        list.add("Emil");
        list.add("Emin");
        list.add("Eli");
        list.add("Ibrahim");
        System.out.println(list);


        LinkedHashSet<Integer> numbers2=new LinkedHashSet<>();
        numbers2.add(46);
        numbers2.add(78);
        numbers2.add(34);
        numbers2.add(5);
        numbers2.add(70);
        numbers2.add(32);
        numbers2.add(2);
        System.out.println(numbers2);

        if(numbers2.contains(32)){
            System.out.println("iceride var");
        }else{
            System.out.println("Iceride yoxdur");
        }

        List<String> list3=new ArrayList<>();
        Set<String> sets=new HashSet<>();



    }
}
