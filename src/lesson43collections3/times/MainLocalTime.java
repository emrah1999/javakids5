package lesson43collections3.times;

import java.time.LocalTime;

public class MainLocalTime {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println("Now is: " + now);
        LocalTime luchTime= LocalTime.of(12,30);
        LocalTime luchTime1= LocalTime.of(12,30,45);
        LocalTime luchTime4= LocalTime.of(12,30,40, 500);
        System.out.println("Luch time is: " + luchTime);
        System.out.println("Luch time is: " + luchTime1);
        System.out.println("Luch time is: " + luchTime4);
        LocalTime afterTwoHours= now.plusHours(2);
        System.out.println("After two hours is: " + afterTwoHours);
    }
}
