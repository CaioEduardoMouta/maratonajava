package javacore.Zcolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListTest {
    public static void main(String[] args) {
        List<String> alemanha = new ArrayList<>();
        alemanha.add("Podolski");
        alemanha.add("Klose");
        alemanha.add("Lahm");
        alemanha.add("Muller");
        alemanha.add("Mario Gotze");
        alemanha.add(0, "Mario Gomez");
        Collections.sort(alemanha);
        List<Double> overall = new ArrayList<>();
        overall.add(92.2);
        overall.add(88.9);
        overall.add(82.1);
        overall.add(87.2);
        Collections.sort(overall);
        for (String nome: alemanha) {
            System.out.println(nome);
        }

        for (Double numero: overall) {
            System.out.println(numero);
        }

    }
}
