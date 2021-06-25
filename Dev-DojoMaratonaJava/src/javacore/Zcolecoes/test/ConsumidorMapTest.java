package javacore.Zcolecoes.test;

import javacore.Zcolecoes.classes.Consumidor;
import javacore.Zcolecoes.classes.Produto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsumidorMapTest {
    public static void main(String[] args) {
        Consumidor palmeirense = new Consumidor("Palmeirense","122");
        Consumidor saopaulino = new Consumidor("São Paulino","332");
        Produto n1 = new Produto("123", "Sem Mundial", 9212.1);
        Produto n2 = new Produto("321", "Bi-Rebaixado", 2221.2);
        Produto n3 = new Produto("878", "Tri-Mundial", 3131.2);
        Produto n4 = new Produto("094", "Nunca Rebaixado", 2211.2);
        Produto n5 = new Produto("99", "Sem Copinha", 2221.2);

        Map<Consumidor, List<Produto>> map = new HashMap<>();

        List<Produto> produtosCon1 = new ArrayList<>();
        produtosCon1.add(n1);
        produtosCon1.add(n2);
        produtosCon1.add(n5);
        List<Produto> produtosCon2 = new ArrayList<>();
        produtosCon2.add(n3);
        produtosCon2.add(n4);

        map.put(palmeirense,produtosCon1);
        map.put(saopaulino,produtosCon2);
        for (Map.Entry<Consumidor,List<Produto>> entry : map.entrySet()) {
            System.out.println(entry.getKey().getNome());
            for (Produto produto : entry.getValue()) {
                System.out.println(produto.getNome());
            }
        }
    }
}
