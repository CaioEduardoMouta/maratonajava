package javacore.Sstring.test;

import java.util.Locale;

public class StringTest {
    public static void main(String[] args) {
        String nome = "Roger";
        nome = nome.concat("Federer"); // nome += " Federer";
        String nome2 = "Serena Williams";
        String nome3 = new String("Djokovic");

        String teste = "Andy Murray";
        String teste2 = "andy murray";
        String teste3 = "   ANDY MURRAY";
        System.out.println(teste.charAt(3));
        System.out.println(teste.equalsIgnoreCase(teste2));
        System.out.println(teste.length());
        System.out.println(teste.replace('a','o'));
        System.out.println(teste3.toLowerCase());
        System.out.println(teste2.toUpperCase());
        System.out.println(teste2.substring(0,2));
        System.out.println(teste3.trim());
    }
}
