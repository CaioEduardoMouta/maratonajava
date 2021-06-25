package javacore.introducaometodos.teste;

import javacore.introducaometodos.classes.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.CPF = "122.222.222-22";
        prof.matricula = "11122";
        prof.nome = "Marcelo Falcão";
        prof.rg = "122211-2";

        Professor prof2 = new Professor();
        prof2.CPF = "122.222.222-22";
        prof2.matricula = "11122";
        prof2.nome = "Rogério Ceni";
        prof2.rg = "122211-2";

      //  System.out.println("Dentro do professor test");
        //System.out.println(prof.nome);
        prof.imprime();
        prof2.imprime();
        //Apagando endereço de memória e substituindo por Diego Lugano
       // System.out.println(/*Diego Lugano*/prof.nome);

       // prof.imprime(prof);
       // prof.imprime(prof2);


    }
}
