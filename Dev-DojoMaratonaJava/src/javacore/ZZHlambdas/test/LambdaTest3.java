package javacore.ZZHlambdas.test;

import javacore.ZZHlambdas.classes.Carro;
import javacore.ZZHlambdas.classes.ComparadorCarro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

import static java.util.Arrays.asList;

public class LambdaTest3 {
    public static void main(String[] args) {
        //System.out::println o java já sabe que você quer imprimir os valores do array
        forEach(asList("Activision", "War", "Call of Duty MW"), System.out::println);
        List<Carro> carros = asList(new Carro("Vermelho Pepper", 1999), new Carro("Azul Ocean", 2005), new Carro("Preto Carbon Flash", 2017));
        Collections.sort(carros, ComparadorCarro::comparePorCor);
        System.out.println(carros);
        Supplier<ComparadorCarro> comparadorCarroSupplier = ComparadorCarro::new;
        Collections.sort(carros, comparadorCarroSupplier.get()::comparePorAno);
        System.out.println(carros);
        ComparadorCarro comparadorCarro = new ComparadorCarro();
        Collections.sort(carros, comparadorCarro::comparePorAno);
        System.out.println(carros);
        //Referencia a uma instancia de metodo de um objeto particular
        List<String> nomes = asList("Call of Duty", "Battlefield", "Killzone", "Battle-Front");
        nomes.sort((s1, s2) -> s1.compareTo(s2));
        nomes.sort(String::compareTo);
        System.out.println(nomes);
        Function<String, Integer> stringToInteger = (String s) -> Integer.parseInt(s);
        Function<String, Integer> stringToInteger2 = Integer::parseInt;
        BiPredicate<List<String>, String> contains = (lista, elemento) -> lista.contains(elemento);
        BiPredicate<List<String>, String> contains2 = List::contains;
        System.out.println(stringToInteger2.apply("10"));
        System.out.println(contains2.test(nomes, "Killzone"));
        //Referencia para um construtor
        BiFunction<String, Integer, Carro> carroBiFunction = (s,i) -> new Carro(s,i);
        BiFunction<String, Integer, Carro> carroBiFunction2 = Carro::new;
        System.out.println(carroBiFunction.apply("rosa", 1994));
        System.out.println(carroBiFunction2.apply("roxo",2001));



    }
    public static <T> void forEach(List<T> list, Consumer<T> c) {
        for (T e : list) {
            c.accept(e);
        }
    }

    public static <T , R> List<R> map(List<T> list, Function<T, R> f) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            result.add(f.apply(e));
        }
        return result;
    }
}
