package lesson42Collesctions2.map;

import com.sun.source.util.Trees;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> map=new HashMap<>();
        map.put("name","Rafiq");
        map.put("surname","Rafiqov");
        map.put("age","25");
        map.put("city","Rafiq");
        map.put("name","Ali");
        System.out.println(map);

        TreeMap<Integer,String> treeMap=new TreeMap<>();
        treeMap.put(1,"Rafiq");
        treeMap.put(2,"Rafiqov");
        treeMap.put(1,"Ali");
        System.out.println(treeMap);

        System.out.println(map.get("name"));
        System.out.println(map.remove("age"));
        System.out.println(map.containsKey("city"));
        System.out.println(map);

        for (Map.Entry<Integer,String> entry : treeMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        Set<Map.Entry<Integer, String>> entrySet=treeMap.entrySet();

        System.out.println(entrySet);

        Set<Integer> keys=treeMap.keySet();
        System.out.println(keys);


    }
}
