package javacore.ZZJoptional.test;

import javacore.ZZJoptional.classes.Carro;
import javacore.ZZJoptional.classes.Pessoa;
import javacore.ZZJoptional.classes.Seguradora;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalTest2 {
    public static void main(String[] args) {
        Seguradora seguradora = new Seguradora("Seguradora Dragon Ball");
        Carro carro = new Carro(seguradora, "Porsche");
        Pessoa p = new Pessoa(carro, "Gohan");
        obterNomeSeguradora(Optional.ofNullable(p));
        checarNomeSeguradora(seguradora);
        checarNomeSeguradoraOptional(seguradora);
        p.setIdade(20);
        System.out.println(obterNomeSeguradoraComIdade(p, 30));
        Map<String, String> map = new HashMap<>();
        System.out.println(Optional.ofNullable(map.get("Kaka")));
        stringToInt("A");
    }
    private static Optional<Integer> stringToInt(String numero) {
        try {
            return Optional.of(Integer.parseInt(numero));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }
    private static void checarNomeSeguradora(Seguradora seguradora) {
        if(seguradora != null && seguradora.getNome().equals("Seguradora Dragon Ball")){
            System.out.println("kame kame kame raaaaaaaa");
        }
    }
    private static void checarNomeSeguradoraOptional(Seguradora seguradora) {
        Optional.ofNullable(seguradora).filter(s -> s.getNome().equals("Seguradora Dragon Ball"))
                .ifPresent(x -> System.out.println("Fusão raaa"));
    }

    private static String obterNomeSeguradoraComIdade(Pessoa p, int idadeMinima) {
        return Optional.ofNullable(p)
                .filter(pessoa -> pessoa.getIdade() >= idadeMinima)
                .flatMap(Pessoa::getCarro)
                .flatMap(Carro::getSeguradora)
                .map(Seguradora::getNome)
                .orElse("Não existe");
    }
    /*
    Map operação produz um valor de saída para cada valor de entrada
    flatMap operação produz um número arbitrário (zero ou mais)
    para cada valor de entrada
     */
    public static String obterNomeSeguradora (Optional<Pessoa> p) {
        System.out.println(
                p.flatMap(Pessoa::getCarro)
                .flatMap(Carro::getSeguradora)
                .map(Seguradora::getNome).orElse("Não existe")
        );
        return "";
    }


}
