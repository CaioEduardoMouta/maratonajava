package javacore.ZZFpadroesdeprojeto.test;

import javacore.ZZFpadroesdeprojeto.classes.Aviao;

public class TesteAviao {
    public static void main(String[] args) {
        agendarAssento("1A");
        agendarAssento("1A");
    }
    private static void agendarAssento(String assento) {
        Aviao a = new Aviao();
        System.out.println(a.bookAssento(assento));
    }
}
