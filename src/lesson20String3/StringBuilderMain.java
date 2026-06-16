package lesson20String3;

public class StringBuilderMain {
    public static void main(String[] args) {
        String s1="Ibrahim";
        StringBuilder sb1=new StringBuilder("Ibrahim");
        System.out.println("Basladi");
        for (int i = 0; i < 150000; i++) {
            sb1.append(" Ibrahim");
        }
        System.out.println("Bitdi");

    }
}
