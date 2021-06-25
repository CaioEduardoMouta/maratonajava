package javacore.ZZNdatetime.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class DateTimeAPITest6 {
    public static void main(String[] args) {
        for(Map.Entry<String, String> zonas : ZoneId.SHORT_IDS.entrySet()) {
            System.out.println(zonas.getKey() + " " +zonas.getValue());
        }
        System.out.println("---------------------");
        System.out.println(ZoneId.systemDefault());
        ZoneId Zimbabue = ZoneId.of("Africa/Harare");
        System.out.println(Zimbabue);
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        ZonedDateTime zonedDateTime = dateTime.atZone(Zimbabue);
        System.out.println(zonedDateTime);
        Instant instant = Instant.now();
        System.out.println(instant);
        ZonedDateTime zonedDateTime2 = instant.atZone(Zimbabue);
        System.out.println(zonedDateTime2);
        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);
        ZoneOffset manausOffset = ZoneOffset.of("-04:00");
        LocalDateTime dateTime2 = LocalDateTime.now();
        OffsetDateTime offsetDateTime = OffsetDateTime.of(dateTime2,manausOffset);
        System.out.println(offsetDateTime);
        OffsetDateTime offsetDateTime1 = dateTime2.atOffset(manausOffset);
        System.out.println(offsetDateTime1);
        Instant instant2 = Instant.now();
        System.out.println(instant2.atOffset(manausOffset));

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);
        LocalDate Old = LocalDate.of(1900,2,1);
        System.out.println(JapaneseDate.from(Old));

        
    }
}
