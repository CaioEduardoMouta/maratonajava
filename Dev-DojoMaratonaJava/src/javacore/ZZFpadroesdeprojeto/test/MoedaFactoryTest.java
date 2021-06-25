package javacore.ZZFpadroesdeprojeto.test;

import javacore.ZZFpadroesdeprojeto.classes.Moeda;
import javacore.ZZFpadroesdeprojeto.classes.MoedaFactory;
import javacore.ZZFpadroesdeprojeto.classes.Pais;

public class MoedaFactoryTest {
    public static void main(String[] args) {
        Moeda moeda = MoedaFactory.criarMoeda(Pais.EUA);
        System.out.println(moeda.getSimbolo());
    }
}
