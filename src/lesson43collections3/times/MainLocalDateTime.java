package lesson43collections3.times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class MainLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Now is: " + now);
        LocalDate today= LocalDate.now();
        LocalTime nowTime= LocalTime.now();
        LocalDateTime adigun=LocalDateTime.of(today,nowTime);
        LocalDateTime adi=LocalDateTime.of(2024,4,23,12,30,35);
        System.out.println("Adigun is: " + adigun);
        System.out.println("Adigun is: " + adi);

        System.out.println(now.getDayOfWeek());
        System.out.println(now.getYear());
        System.out.println(now.getMonth());
        System.out.println(now.getMonthValue());

        Period period=Period.between(today,adi.toLocalDate());
        System.out.println("Period is: " + period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days");
    }
}
