package javacore.ZZHlambdas.test;

import javacore.ZZHlambdas.Interface.CarroPredicate;
import javacore.ZZHlambdas.classes.Carro;

import java.util.function.Predicate;

// anonima , não tem nomes nas lambdas
// function tem que usar função porque não está associado a nehuma classe;
// Metodos estão associados a classe , lambdas não
// passada de um argumento para um metodo ou guarda ela em uma variavel
// Concisa
// (Carro carro) -> carro.getCor().equals("verde");
// Primeira parte parametro se não tiver parametros usar (vazio)
// depois a seta para separar a lista de parametros depois o corpo
//separados em parametros , seta e expressão
//(parametro) -> <expressao>
//(String s) -> s.length()
// (int a, int b) -> {sout(a+b)}
        /*
         uma função lambda é uma função sem declaração, isto é, não é
         necessário colocar um nome, um tipo de retorno e o modificador
         de acesso. A ideia é que o método seja declarado no mesmo lugar
         em que será usado.
         */
public class LambdaTest {
    public static void main(String[] args) {
        CarroPredicate carroPredicate = new CarroPredicate() {
            @Override
            public boolean test(Carro carro) {
                return carro.getCor().equals("verde");
            }
        };
        //Target Type o que a lambda está esperando
        // Ele vai acessar o metodo pedindo alguma coisa
        Predicate<Carro> carroPredicate2 = (Carro carro) -> {return carro.getCor().equals("verde");};
        System.out.println(carroPredicate.test(new Carro("verde",2012)));
        System.out.println(carroPredicate2.test(new Carro("verde",2012)));
        Runnable runnable = () -> System.out.println("Dentro");
        new Thread(runnable).start();

    }
}
