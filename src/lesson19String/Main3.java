package lesson19String;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        String s1="Qasimli EMin";
        char[] chars=s1.toCharArray();
        System.out.println(Arrays.toString(chars));


        String str1="Ibrahim";
        char[] chars1=new char[str1.length()];
        System.out.println(Arrays.toString(chars1));
        for (int i = 0; i < str1.length(); i++) {
            chars1[i]=str1.charAt(i);
        }
            System.out.println(Arrays.toString(chars1));

        System.out.println("*************");
        String str2=" ";
        if (str2.isBlank()){
            System.out.println("String bosdur");
        }
        if (str2.isEmpty()){
            System.out.println("String bosdur");
        }

    }
}
