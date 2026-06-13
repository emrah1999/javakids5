package lesson19String;

public class Main2 {
    public static void main(String[] args) {
        String s1="Rafiq";
        if(s1.startsWith("Ra")){
            System.out.println("R ile bashlayir");
        }else{
            System.out.println("R ile bashlamir");
        }

        System.out.println("*************");

        if(s1.endsWith("Rafiq")){
            System.out.println("iq ile bitir");
        }else{
            System.out.println("iq ile bitmir");
        }
        System.out.println("*************");

        String phone1="05043534";
        String phone2="050-43534";
        String phone3="070-435-34-23";
        String pattern="[0-9]{3}-[0-9]{3}-[0-9]{2}-[0-9]{2}";
        if(phone1.matches(pattern)){
            System.out.println("Phone 1 uygundu");
        }else if(phone2.matches(pattern)){
            System.out.println("Phone 2 uygundu");
        }else if(phone3.matches(pattern)){
            System.out.println("Phone 3 uygundu");
        }else{
            System.out.println("Hech biri uygun deyil");
        }

    }
}
