package lesson42Collesctions2.map;

import java.util.ArrayList;
import java.util.TreeMap;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("Rafiq");
        list.add("Eli");
        list.add("Rafiq");
        list.add("Eli");
        list.add("Ibrahim");
        list.add("Emil");
        list.add("Emin");
        list.add("Eli");
        list.add("Emin");

        TreeMap<String,Integer> treeMap=new TreeMap<>();
        //{rafiq=2,eli=3,ibrahim=1,emil=1,emin=2}
        for (String name:list){
            if(treeMap.containsKey(name)){
                treeMap.put(name,treeMap.get(name)+1);
            }else{
                treeMap.put(name,1);
            }
        }
        System.out.println(treeMap);

    }
}
