package lesson18SinifObyektString;

public class Main3 {
    public static void main(String[] args) {
        String ad="Ibrahim";

        System.out.println(ad.length());
        int index=8;
        if(index<ad.length()){
            System.out.println(ad.charAt(4));
        }else{
            System.out.println("index adin uzunlugundan boyukdur");
        }

    }
}
