package javacore.Zcolecoes.test;

import javacore.Zcolecoes.classes.Celular;
import javacore.Zcolecoes.classes.Produto;

import javax.print.CancelablePrintJob;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

//class CelularNomeComparator implements Comparator<Celular> {
//
//    @Override
//    public int compare(Celular o1, Celular o2) {
//        return o1.getNome().compareTo(o2.getNome());
//    }
//}

public class TreeSetTest {
    public static void main(String[] args) {
        Produto n1 = new Produto("92", "Maya Gabeira", 9212.1, 1);
        Produto n2 = new Produto("90", "Pedro Scooby", 2221.2, 2);
        Produto n3 = new Produto("87", "Gabriel Medina", 3131.2, 3);
        Produto n4 = new Produto("94", "Kelly Slater", 2211.2, 5);
        Produto n5 = new Produto("99", "Felipe Toledo", 2221.2, 9);
//        Celular celular = new Celular("Tony Hawk", "2121");
        NavigableSet<Produto> Surfistas = new TreeSet<>();
//        NavigableSet<Celular> Skate = new TreeSet<>(new CelularNomeComparator());
//        Skate.add(celular);

        //Necessita um comparator
//        for(Celular celular1 : Skate) {
//            System.out.println(celular1);
//        }
        Surfistas.add(n1);
        Surfistas.add(n2);
        Surfistas.add(n3);
        Surfistas.add(n4);
        Surfistas.add(n5);

        //Lista em ordem inversa
        for (Produto produto : Surfistas.descendingSet()) {
            System.out.println(produto);
        }
        System.out.println("-----------------------");
        //lower <
        // floor <=
        // higher >
        // ceiling >=
        System.out.println(Surfistas.size());
        System.out.println(Surfistas.pollLast());
        System.out.println(Surfistas.size());


    }
}
