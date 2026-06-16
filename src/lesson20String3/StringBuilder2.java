package lesson20String3;

public class StringBuilder2 {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Emin");
        System.out.println(str);
        str.append(" Emin");
        System.out.println(str);
        str.insert(2,"44");
        System.out.println(str);
        str.reverse();
        System.out.println(str);
    }
}
