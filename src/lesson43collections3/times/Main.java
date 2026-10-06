package lesson43collections3.times;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        String time="2026-10-23";

        System.out.println("Time is: " + time);
        LocalDate localDate=LocalDate.parse(time);
        System.out.println("LocalDate is: " + localDate);

        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String azDate=dateTimeFormatter.format(localDate);
        System.out.println("AzDate is: " + azDate);
    }
}
