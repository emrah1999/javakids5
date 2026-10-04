package lesson42Collesctions2.comparable;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<Student> treeMap=new TreeSet<>();
        System.out.println("TreeSet: " + treeMap);
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student("John", 20));
        students.add(new Student("Alice", 22));
        students.add(new Student("Bob", 19));
        System.out.println("Before sorting: " + students);
        Collections.sort(students);
        System.out.println("After sorting: " + students);

        HashSet<Student> hashSet=new HashSet<>();
        Student student1=new Student("John", 20);
        Student student2=new Student("John", 20);
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        hashSet.add(student1);
        hashSet.add(student2);
        System.out.println("HashSet: " + hashSet);


    }
}
