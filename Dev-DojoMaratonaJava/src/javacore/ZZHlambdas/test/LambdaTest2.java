package javacore.ZZHlambdas.test;

import javacore.ZZHlambdas.classes.Carro;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.*;

import static java.util.Arrays.asList;

public class LambdaTest2 {
    public static void main(String[] args) {
        forEach(asList("Eletronic Arts", "EA Sports", "FIFA"), (String s) -> System.out.println(s));
        List<Integer> list = map(asList("Eletronic Arts", "EA Sports", "FIFA"), (String s) -> s.length());
        List<Carro> carros = asList(new Carro("Azul",2012),new Carro("Preto",2011),new Carro("Preto",2011));
        List<String> listCores = map(carros, (Carro c) -> c.getCor());
        System.out.println(list);

        Predicate<Integer> pares = (Integer i) -> i % 2 == 0;
        IntPredicate impar = (int i) -> i % 2==1;
        System.out.println(pares.test(1000));
        System.out.println(impar.test(1000));
        // Variavel final não pode ser alterada
        // Efetivamente final , quando você tem uma variavel local e não altera em nenhuma parte do codigo
        // Variaveis de Instancias vive no heap e são compartilhadads com varias threads
        final String cor = "VERMELHO";
        Predicate<String> p = (String s) -> listCores.add(s);
        Consumer<String> b = (String s) -> listCores.add(cor);
        //Supplier só serve para retornar alguma coisa
        Supplier<String> sup1 = () -> "oi";
        Supplier<Carro> sup2 = () -> new Carro("Preto", 2011);

        System.out.println(sup2.get());
        b.accept("AMARELO");
        System.out.println(listCores);

//        p.test("amarelo");
//        System.out.println(listCores);


        /*
        Callable: Interface para a implementação de uma execução em paralelo. É muito parecida com a interface
        Runnable, mas esta não retorna nenhum valor, enquanto a Callable deve retornar um valor ao final da execução;
         */
       // Callable<Integer> c = () -> 100;
       // PrivilegedAction<Integer> p = () -> 100;// Não achei nada em português , mas pela tradução literal é uma ação previlegiada

    }

    public static <T> void forEach (List<T> list, Consumer<T> c) {
        for(T e : list) {
            c.accept(e);
        }
    }
    public static <T, R> List<R> map(List<T> list, Function<T, R> f)  {
        List<R> result = new ArrayList<>();
        for (T e: list) {
            result.add(f.apply(e));
        }
        return result;
    }
}
