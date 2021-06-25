package javacore.ZZFpadroesdeprojeto.test;

import javacore.ZZFpadroesdeprojeto.classes.Pessoa;

public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa.PessoaBuilder("Caio")
                .nomeDoMeio("Martins")
                .ultimoNome("Mouta")
                .apelido("Cadu")
                .build();
        System.out.println(p);

    }
}
