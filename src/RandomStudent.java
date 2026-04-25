import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomStudent {
    public static void main(String[] args) {
        List<String> students=new ArrayList<>();
        students.add("Rafiq");
        students.add("Emin");
        students.add("Emil");
        students.add("Eli");
        students.add("Ibrahim");
        Random random = new Random();
        System.out.println(students.get(random.nextInt(0, students.size())));
    }
}
