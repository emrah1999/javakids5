package lesson18SinifObyektString;

public class Main5 {
    public static void main(String[] args) {
        String text="Men java dili oyrenirem";
        if(text.contains("di")){
            System.out.println("Bu cumlede java var");
        }else{
            System.out.println("Bu cumlede java yoxdur");
        }

        String number="9940513121698";
        System.out.println(number.substring(4,9));

        String message="Salam {name} necesen?";
        String[] adlar={"Ali","Emil","Ibrahim"};
        for (String ad:adlar){
            String mesaj=message;
            System.out.print(ad+" sexsine mesaj gonderildi. mesajimiz: ");
            mesaj=mesaj.replace("{name}",ad);
            System.out.println(mesaj);
        }


    }
}
