package javacore.Zcolecoes.test;

import javacore.Zcolecoes.classes.Produto;

import java.util.*;

class ProdutoNomeComparator implements Comparator<Produto> {

    @Override
    public int compare(Produto o1, Produto o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}
public class SortProdutoTest {
    public static void main(String[] args) {
        List<Produto> Belgica = new ArrayList<>();
        Produto[] belgicaArray = new Produto[4];
        Produto J1 = new Produto("92","Courtois",92121);
        Produto J2 = new Produto("90", "De Bruyne", 22212);
        Produto J3 = new Produto("87","Lukaku",31312);
        Produto J4 = new Produto("94","Eden Harzard",22112);
        Belgica.add(J1);
        Belgica.add(J2);
        Belgica.add(J3);
        Belgica.add(J4);

        belgicaArray[0] = J1;
        belgicaArray[1] = J2;
        belgicaArray[2] = J3;
        belgicaArray[3] = J4;
        Collections.sort(Belgica,new ProdutoNomeComparator());
//        for (Produto produto : Belgica) {
//            System.out.println(produto);
//        }
        Arrays.sort(belgicaArray);
        for (Produto produto : belgicaArray) {
            System.out.println(produto);
        }

    }
}
