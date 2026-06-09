package lesson18SinifObyektString;

public class Main4 {
    public static void main(String[] args) {
        String ad="IbrOsShim";
        System.out.println(ad.toUpperCase());
        System.out.println(ad);
        System.out.println(ad.toLowerCase());
        System.out.println(ad);

//        String car1="bmw";
//        String car2="bmw";
        String car1=new String("bmw");
        String car2=new String("bmw");
        if (car1.equals(car2)){
            System.out.println("Beraberdir");
        }else{
            System.out.println("Beraber deyil");
        }
    }
}
