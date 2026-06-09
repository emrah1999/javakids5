package lesson18SinifObyektString;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main6 {
    public static void main(String[] args) {
        String text="Salam";
        String[] arrays=text.split("");
        String newtex="Java dili oyrenirem";
        System.out.println(Arrays.toString(arrays));
        String[] array2=newtex.split(" ");
        System.out.println(Arrays.toString(array2));

        String text2="    Salam   ";
        System.out.println(text2.trim());

        String name="Emin  iiii";
        System.out.println(name.indexOf("i"));
    }
}
