package javacore.Zcolecoes.test;

import javacore.Yserializacao.classes.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {
        List<String> Inglaterra = new ArrayList<>();
        List<String> Portugal = new ArrayList<>();
        Inglaterra.add("Lampard");
        Inglaterra.add("Gerrard");
        Portugal.add("Deco");
        Portugal.add("Luis Figo");
//        System.out.println("size "+ Inglaterra.size());
//        System.out.println(Inglaterra.remove("Lampard"));
//        System.out.println("size "+ Inglaterra.size());
        Inglaterra.clear();
        Inglaterra.addAll(Portugal);
        int size = Inglaterra.size();
        for(int i = 0; i< size; i++) {
            System.out.println(Inglaterra.get(i));

        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(4);
        for (Integer num : numeros) {
            System.out.println(num);
        }
        // Não pode modificar enquanto o foreach for executado
//        for (String nome: nomes) {
//            System.out.println(nome);
//        }
//
//        nomes.add("Rooney");
//        for (String nome: nomes) {
//            System.out.println(nome);
//        }
    }
}
