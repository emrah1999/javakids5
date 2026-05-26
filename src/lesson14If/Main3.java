package lesson14If;

public class Main3 {
    public static void main(String[] args) {
        int age =18;
        boolean hasLicense=true;

        if(age>=18){
            if (hasLicense){
                System.out.println("Yahsin var");
            }
            else{
                System.out.println("Yahsin var amma surmek ucun icazen yoxdur");
            }

        }
        else
        {
            System.out.println("Yahsin catmir");
        }
    }
}
