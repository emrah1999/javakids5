package lesson20String3;

public class MainFormat {
    public static void main(String[] args) {
        String f=String.format("Salam men %s. Menim %d yashim var. men %f " +
                "manat qazaniram. Menim adim %c herfi" +
                " ile bashlayir. %n  netice %b","Eli",15,500F,'E',true);
        System.out.println(f);

        System.out.printf("|%10s|",
                "Java");
        System.out.println();

        String s1=String.format("%05d",42);
        String g="Salam %s. %d";
        String n1=String.format(g,"Rafiq",15);
        String n2=g.formatted("Rafiq",15);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(s1.replace("0","5"));
    }
}
