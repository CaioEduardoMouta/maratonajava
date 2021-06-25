package javacore.ZZNdatetime.test;

import java.sql.SQLOutput;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTimeAPITest2 {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);
        System.out.println(LocalDateTime.now());
        System.out.println(instant.getEpochSecond());
        System.out.println(instant.getNano()); //999.99.99
        System.out.println(Instant.ofEpochSecond(3));
        System.out.println(Instant.ofEpochSecond(3,0));
        System.out.println(Instant.ofEpochSecond(2,1_000_000_000));
        System.out.println(Instant.ofEpochSecond(2,-1_000_000_000));
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.of(2017,1,1,23,0,0);
        LocalTime time1 = LocalTime.now();
        LocalTime time2 = LocalTime.of(5,0,0);
        // Não pode usar LocalDate
        // Não pode misturar LocalDateTime com LocalTime

        Duration d1 = Duration.between(dt1,dt2);
        Duration d2 = Duration.between(time1, time2);
        Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        Duration d4 = Duration.between(dt2,time2.atDate(dt2.toLocalDate()));
        Duration d5 = Duration.ofMinutes(3);
        Duration d6 = Duration.ofDays(10);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);

        System.out.println("________PERIOD_____________");
        Period p1 = Period.between(dt1.toLocalDate(),dt2.toLocalDate());
        Period p2 = Period.ofDays(10);
        Period p3 = Period.ofWeeks(58);
        Period p4 = Period.ofYears(3);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
//        System.out.println(Period.between(LocalDate.now(),LocalDate.now().plusDays(p3.getDays())));
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.until(now.plusDays(p3.getDays()),ChronoUnit.MONTHS));
        System.out.println(p4);

        System.out.println("________CHRONOUNIT_____________");
        LocalDateTime Maya = LocalDateTime.of(2021,1,30,7,43,11);
        System.out.println(ChronoUnit.DAYS.between(Maya,now));
        System.out.println(ChronoUnit.MONTHS.between(Maya,now));
        System.out.println(ChronoUnit.WEEKS.between(Maya,now));
        System.out.println(ChronoUnit.YEARS.between(Maya,now));
    }
}
