package javacore.Zcolecoes.test;

import javacore.Zcolecoes.classes.Celular;

import java.util.ArrayList;
import java.util.List;

public class ListCelularTest {
    public static void main(String[] args) {
        Celular portugal = new Celular("Rui Costa", "8");
        Celular holanda = new Celular("Van Persie", "9");
        Celular franca = new Celular("Henry", "7");
        List<Celular> celularList = new ArrayList<>();
        celularList.add(portugal);
        celularList.add(holanda);
        celularList.add(franca);

        for (Celular celular :celularList) {
            System.out.println(celular);
        }
        Celular portugal2 = new Celular("Rui Costa", "8");
        System.out.println(celularList.contains(portugal2));
    }
}
