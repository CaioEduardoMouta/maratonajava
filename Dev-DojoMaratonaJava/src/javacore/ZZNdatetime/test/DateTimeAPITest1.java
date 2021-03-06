package javacore.ZZNdatetime.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class DateTimeAPITest1 {
    public static void main(String[] args) {
//        System.out.println(new Date());
//        System.out.println(Calendar.getInstance());
        LocalDate date = LocalDate.of(2021, Month.MARCH, 15);
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear());
        System.out.println(date.get(ChronoField.YEAR));
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));
        LocalDate now = LocalDate.now();
        System.out.println(date);
        System.out.println(now);
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
        System.out.println("------------LocalDateTime-----------");
        LocalTime time = LocalTime.of(22,2,33);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);
        System.out.println(time);
        System.out.println("---------Parsing------------");
        LocalDate parseDate = LocalDate.parse("2021-03-15");
        LocalTime parseTime = LocalTime.parse("21:42:33");
        System.out.println(parseDate);
        System.out.println(parseTime);
        System.out.println("----------LocalDateTime----------");
        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime ldt1 = LocalDateTime.of(2020,1,1,22,33,11);
        LocalDateTime ldt2 = date.atTime(10,20,20);
        LocalDateTime ldt3 = date.atTime(LocalTime.now());
        LocalDateTime ldt4 = time.atDate(LocalDate.now());
        LocalDateTime ldt5 = time.atDate(date);

        System.out.println(ldt);
        System.out.println(ldt1);
        System.out.println(ldt2);
        System.out.println(ldt3);
        System.out.println(ldt4);
        System.out.println(ldt5);

    }
}
