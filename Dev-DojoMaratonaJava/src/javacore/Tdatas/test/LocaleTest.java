package javacore.Tdatas.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {
    public static void main(String[] args) {
        //ISO 639 pt= portugues BR- Brasil, en- ingles
        Locale locItaly = new Locale("it", "IT");
        Locale locSuica = new Locale("it","CH");
        Locale locIndia = new Locale("hi","IN");
        Locale locJapan = new Locale("ja");
        Calendar c = Calendar.getInstance();
        c.set(2021, Calendar.DECEMBER, 23);
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, locSuica);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, locIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, locJapan);
        System.out.println("Italia " +df.format(c.getTime()));
        System.out.println("Suica "+df2.format(c.getTime()));
        System.out.println("India " +df3.format(c.getTime()));
        System.out.println("Japão "+ df4.format(c.getTime()));

        System.out.println(locItaly.getDisplayLanguage(locItaly));
        System.out.println(locJapan.getDisplayLanguage(locItaly));
        System.out.println(locSuica.getDisplayCountry(locItaly));
    }
}
