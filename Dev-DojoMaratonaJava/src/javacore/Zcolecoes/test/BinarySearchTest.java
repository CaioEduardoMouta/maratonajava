package javacore.Zcolecoes.test;

import javacore.Zcolecoes.classes.Produto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);
        // (-(ponto de inserção) -1), -1 -1 = -2
        Collections.sort(numeros);
        //0,1,2,3
        //0,2,3,4
        System.out.println(Collections.binarySearch(numeros,1 ));
       // System.out.println(numeros.get(Collections.binarySearch(numeros,2)));

        List<Produto> Belgica = new ArrayList<>();
       // Produto[] belgicaArray = new Produto[4];
        Produto J1 = new Produto("92","Courtois",92121);
        Produto J2 = new Produto("90", "De Bruyne", 22212);
        Produto J3 = new Produto("87","Lukaku",31312);
        Produto J4 = new Produto("94","Eden Harzard",22112);
        Belgica.add(J1);
        Belgica.add(J2);
        Belgica.add(J3);
        Belgica.add(J4);
        Collections.sort(Belgica,new ProdutoNomeComparator());
        Produto J5 = new Produto("","Carrasco",50);
        for(Produto produto : Belgica) {
            System.out.println(produto);
        }
        System.out.println(Collections.binarySearch(Belgica, J5, new ProdutoNomeComparator()));
        Integer[] arrayInteger = new Integer[4];
        arrayInteger[0] = 2;
        arrayInteger[1] = 0;
        arrayInteger[2] = 4;
        arrayInteger[3] = 3;
        Arrays.sort(arrayInteger);
        System.out.println(Arrays.binarySearch(arrayInteger,1));

    }
}
