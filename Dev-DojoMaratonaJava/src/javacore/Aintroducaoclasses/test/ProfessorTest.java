package javacore.introducaoclasses.test;

import javacore.introducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();

        prof.nome = "Falcão";
        prof.matricula = "12223";
        prof.CPF = "3222222222";
        prof.rg = "22123411";

        Professor prof2 = new Professor();

        prof2.nome = "Badaui";
        prof2.matricula = "2223";
        prof2.CPF = "89719022";
        prof2.rg = "313222121";

        //Prof não pode ser mais acessado
        prof = prof2;

        System.out.println(prof.nome);
        System.out.println(prof.CPF);
        System.out.println(prof.matricula);
        System.out.println(prof.rg);
        System.out.println("----------------");
        System.out.println(prof2.nome);
        System.out.println(prof2.CPF);
        System.out.println(prof2.matricula);
        System.out.println(prof2.rg);
    }
}
