package lesson43collections3.times;

import java.time.LocalDate;

public class MainLocalDate {
    public static void main(String[] args) {
        LocalDate today= LocalDate.now();
        System.out.println("Today is: " + today);

        LocalDate birthday= LocalDate.of(1990,5,12);
        System.out.println("Birthday is: " + birthday);

        LocalDate tomorow=today.plusDays(5);
        System.out.println("Tomorrow is: " + tomorow);
        LocalDate yesterday=today.minusDays(5);
        LocalDate lastmont=today.minusMonths(1);
        System.out.println("Yesterday is: " + yesterday);
        System.out.println("Last month is: " + lastmont);
    }
}
