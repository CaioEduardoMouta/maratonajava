package javacore.ZZKstreams.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class StreamTest2 {
    public static void main(String[] args) {
        List<List<String>> nomes = new ArrayList<>();
        nomes.add(asList("Strongman","Hafthor Bjornsson"));
        nomes.add(asList("Fisiculturista","Caio Botura"));
        List<String> collect = nomes.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(collect);

        List<String> palavras = asList("Bodybuilders","Paulo Muzy");
        String[] split = palavras.get(0).split("");
        System.out.println(Arrays.toString(split));
        List<String[]> collect1 = palavras.stream().map(p->p.split("")).collect(Collectors.toList());
        Stream<String> stream = Arrays.stream((String[])palavras.toArray());
        List<String> collect2 = palavras.stream() // Stream<String>
                .map(p->p.split("")) // Stream<String[]>;
                .flatMap(Arrays::stream) // Stream<String>
                .collect(Collectors.toList());
        System.out.println(collect2);
    }
}
