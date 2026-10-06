package lesson43collections3.times;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class MainZonedDateTime {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("Now is: " + now);
        System.out.println("Zone is: " + now.getZone());
        System.out.println("Offset is: " + now.getOffset());
        System.out.println("Day of week is: " + now.getDayOfWeek());

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.of(2024, 4, 23, 12, 30, 35);
        if(localDateTime1.isBefore(localDateTime)){
            System.out.println("LocalDateTime1 is before LocalDateTime");
        } else {
            System.out.println("LocalDateTime1 is after LocalDateTime");
            }

        Instant instant = Instant.now();
        System.out.println("Instant is: " + instant.toEpochMilli());
        System.out.println(System.currentTimeMillis());
    }
}
