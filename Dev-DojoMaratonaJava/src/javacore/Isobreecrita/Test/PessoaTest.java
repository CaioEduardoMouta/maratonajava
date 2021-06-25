package javacore.Isobreecrita.Test;

import javacore.Isobreecrita.classes.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Neymar");
        p.setIdade(30);
        System.out.println(p);
        Pessoa p2 = new Pessoa();
        p2.setNome("De Bruyne");
        p2.setIdade(29);
        System.out.println(p2);
    }
}
