package javacore.ZZAGenerics.Test;

import javacore.ZZAGenerics.classes.Carro;
import javacore.ZZAGenerics.classes.Computador;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ClasseGenericaTeste {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>();
        carrosDisponiveis.add(new Carro("GOL"));
        carrosDisponiveis.add(new Carro("BMW"));
        ObjetosAlugaveis<Carro> carroAlugavel = new ObjetosAlugaveis<>(carrosDisponiveis);
        Carro carro = carroAlugavel.getObjetoDisponivel();
        System.out.println("Usando o carro por um mes");
        carroAlugavel.devolverObjeto(carro);
        System.out.println("&**&@¨#&¨(*&*&(*¨*%&¨$%&%$%$%$%¨*&");
        List<Computador> computadoresDisponiveis = new ArrayList<>();
        computadoresDisponiveis.add(new Computador("Gigabyte"));
        computadoresDisponiveis.add(new Computador("MSI"));
        ObjetosAlugaveis<Computador> computadorAlugavel = new ObjetosAlugaveis<>(computadoresDisponiveis);
        Computador computador = computadorAlugavel.getObjetoDisponivel();
        System.out.println("Usando o computador por um mes");
        computadorAlugavel.devolverObjeto(computador);
    }
}
//Type
class ObjetosAlugaveis<T> {
    private List<T> objetosDisponiveis = new ArrayList<>();
    public ObjetosAlugaveis(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }
    //Alugar

    public T getObjetoDisponivel() {
        T t = objetosDisponiveis.remove(0);
        System.out.println(" Alugando " + t);
        System.out.println("Objetos disponiveis: " +objetosDisponiveis);
        return t;
    }
    public void devolverObjeto(T t) {
        System.out.println("Devolvendo objeto: " +t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos disponiveis" + objetosDisponiveis);
    }
}

