package lesson42Collesctions2.queue;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");

        System.out.println(queue.element());
        System.out.println(queue.poll());
        System.out.println(queue.element());

        System.out.println("---------------------");
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        ListIterator<String> listIterator=arrayList.listIterator();

        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println("---------------------");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        System.out.println("---------------------");

        HashMap<String,Integer> hashMap=new HashMap<>();
        hashMap.put("A",1);
        hashMap.put("B",2);
        hashMap.put("C",3);

        Iterator<Map.Entry<String,Integer>> iterator=hashMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Integer> entry=iterator.next();
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
