package javacore.ZZJoptional.test;

import java.util.Optional;

public class OptionalTest1 {
    private String nome;
    public static void main(String[] args) {
        OptionalTest1 ot = new OptionalTest1();
        //Obrigatoriamente precisa ter um valor
        Optional<String> optional1 = Optional.of("Bullet Coffee");
        Optional<String> optional2 = Optional.empty();//Empty que dizer vazio obvio
        //para saber se a variavel é ou não é nula
        Optional<String> optional3 = Optional.ofNullable(ot.nome);
        //Imprimindo
        System.out.println(optional1);
        System.out.println(optional2);
        System.out.println(optional3);
        //Buscando valores
        System.out.println(optional1.orElse("vazio"));
        System.out.println(optional2.orElse("vazio"));
        System.out.println(optional3.orElse("Vazio"));
     //   System.out.println(ot.nome.toUpperCase());

    }
}
