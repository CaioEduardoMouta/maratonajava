package javacore.ZZKstreams.test;

import javacore.ZZKstreams.classes.Pessoa;

import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

public class StreamTest6Collectors1 {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Pessoa.bancoDePessoas();
        System.out.println(pessoas.stream().count());
        System.out.println(pessoas.stream().collect(counting()));

        Optional<Pessoa> max = pessoas.stream()
                .max(comparing(Pessoa::getSalario));
        System.out.println(max.get().getSalario());
        Optional<Pessoa> collect = pessoas.stream()
                .collect(maxBy(comparing(Pessoa::getSalario)));
        System.out.println(collect.get().getSalario());
        Optional<Pessoa> collect2 = pessoas.stream()
                .collect(minBy(comparing(Pessoa::getSalario)));
        System.out.println(collect2.get().getSalario());

        System.out.println(pessoas.stream().mapToDouble(Pessoa::getSalario).average());
        System.out.println(pessoas.stream().collect(averagingDouble(Pessoa::getSalario)));

        System.out.println(pessoas.stream().mapToDouble(Pessoa::getSalario).sum());
        System.out.println(pessoas.stream().collect(summingDouble(Pessoa::getSalario)));

       DoubleSummaryStatistics collect1 = pessoas.stream().collect(summarizingDouble(Pessoa::getSalario));
        System.out.println(collect1);

        System.out.println(pessoas.stream().map(Pessoa::getNome).collect(joining()));
        System.out.println(pessoas.stream().map(Pessoa::getNome).collect(joining(", ")));


    }
}
