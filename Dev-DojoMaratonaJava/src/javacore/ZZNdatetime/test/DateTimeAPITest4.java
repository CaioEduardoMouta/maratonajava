package javacore.ZZNdatetime.test;

import javacore.ZZNdatetime.test.util.ObterProximoDiaUtil;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateTimeAPITest4 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println(date.getDayOfWeek());

        date = date.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY));
        System.out.println(date);
        System.out.println(date.getDayOfWeek());

        date = date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println(date);
        System.out.println(date.getDayOfWeek());

        date = date.with(TemporalAdjusters.previous(DayOfWeek.SATURDAY));
        System.out.println(date);
        System.out.println(date.getDayOfWeek());

        date = date.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(date);
        System.out.println(date.getDayOfWeek());

        date = date.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(date);
        System.out.println(date.getDayOfWeek());

        date = date.with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(date);
        System.out.println(date.getDayOfWeek());

        date = date.with(new ObterProximoDiaUtil());
        System.out.println(date);
        System.out.println(date.getDayOfWeek());

        date = date.plusDays(4);
        System.out.println(date);
        System.out.println(date.getDayOfWeek());

        date = date.with(new ObterProximoDiaUtil());
        System.out.println(date);
        System.out.println(date.getDayOfWeek());


    }
}
