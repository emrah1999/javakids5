package lesson19String;

public class Main {
    public static void main(String[] args) {
        System.out.println("Stringlerin birleshmesi");
        String str1 = "Hello";
        String str2 = "World";
        System.out.println(str1 + " " + str2);
        System.out.println(str1.concat(" ").concat(str2));

        System.out.println("*************");
        System.out.println("Massivden string yaratmaq");

        char[] charArray = {'H', 'e', 'l', 'l', 'o'};

        String str3=String.copyValueOf(charArray);
        System.out.println(str3);
    }
}
