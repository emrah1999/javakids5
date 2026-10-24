package lesson48;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
    public static void main(String[] args) {
        String pattern ="[0-9]{4}";
        String text="2423 2345 234 5234 235 324234";
        Pattern compile= Pattern.compile(pattern);
        Matcher matcher = compile.matcher(text);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
