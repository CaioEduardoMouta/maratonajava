package javacore.Zcolecoes.test;

import javacore.Zcolecoes.classes.Produto;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Produto n1 = new Produto("92", "Green Bay Packers", 9212.1, 1);
        Produto n2 = new Produto("90", "New England", 2221.2, 2);
        Produto n3 = new Produto("87", "San Francisco", 3131.2, 3);
        Produto n4 = new Produto("94", "Philadelphia", 2211.2, 5);
        Produto n5 = new Produto("99", "Minessota Vikings", 2211.2, 9);
        Set<Produto> NFL = new HashSet<>();
        //Não existe ordem na execução
        //Não possui elementos duplicados
        //LinkedHashSet mantém a ordem de inserção
        NFL.add(n1);
        NFL.add(n2);
        NFL.add(n3);
        NFL.add(n4);
        NFL.add(n5);
        for(Produto p: NFL) {
            System.out.println(p);
        }
    }
}
