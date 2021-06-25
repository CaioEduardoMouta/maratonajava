package javacore.Zcolecoes.test;

import javacore.Zcolecoes.classes.Produto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Se tiver trabalhando com bastante remoção o LinkedList é mais
// rapido que o ArrayList
public class IteratorTest {
    public static void main(String[] args) {
        List<Produto> NBA = new LinkedList<>();
        Produto n1 = new Produto("92", "Spurs", 9212.1, 1);
        Produto n2 = new Produto("90", "Clevend", 2221.2, 0);
        Produto n3 = new Produto("87", "Gold State", 3131.2, 0);
        Produto n4 = new Produto("94", "Lakers", 2211.2, 0);
        NBA.add(n1);
        NBA.add(n2);
        NBA.add(n3);
        NBA.add(n4);
        Iterator<Produto> produtoIterator = NBA.iterator();
        //hasNext(); //next();
        while(produtoIterator.hasNext()) {
            if(produtoIterator.next().getQuantidade() == 0) {
                produtoIterator.remove();
            }
        }
        System.out.println(NBA.size());

    }
}
