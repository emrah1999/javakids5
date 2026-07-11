package lesson27Methods;

public class Main4 {
    public static void main(String[] args) {
        Student student=new Student();
        student.name="Rafiq";
        student.age=34;

        Student student2=new Student();
        student2.name="Ibrahim";
        student2.age=55;

        System.out.println(student.info2());

        student.divide(10,5);
        String name=student.info2();
        String name2=student2.info2();
        System.out.println(name+name2);
        System.out.println(student.info2()+student2.info2());
    }
}
