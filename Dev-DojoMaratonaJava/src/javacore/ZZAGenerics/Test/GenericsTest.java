package javacore.ZZAGenerics.Test;

import javacore.Zcolecoes.classes.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {

    public static void main(String[] args) {
        // type erasure
        // Só funciona em tempo de compilação
        List<String> lista = new ArrayList<>();
        lista.add("String");
        lista.add("String");
        lista.add("Caio Mouta");


        for (String obj : lista) {
            System.out.println(obj);
        }

        add(lista,1l);

    }

    public static void add(List lista, Long l) {
        lista.add(1);
    }
}
