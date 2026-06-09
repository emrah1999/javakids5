package lesson18SinifObyektString;

public class Main2 {
    public static void main(String[] args) {
        String ad = "Ali";
        System.out.println(ad);

        System.out.println(ad.length());
        String soyad = "Mustafazade";
        System.out.println(ad + " " + soyad);

        String soyad2=new String("Mustafazade");
        System.out.println(soyad2);

        ad=ad+"Veli";

        ad=ad.toUpperCase();
        System.out.println(ad);
    }
}
