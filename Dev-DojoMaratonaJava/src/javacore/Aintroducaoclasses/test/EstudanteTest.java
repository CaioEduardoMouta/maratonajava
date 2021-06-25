package javacore.introducaoclasses.test;

import javacore.introducaoclasses.classes.Estudante;

public class EstudanteTest {

    public static void main(String[] args) {
        //Objeto instancia da classe Estudante
        Estudante joao = new Estudante();
        joao.nome = "Joao";
        joao.matricula = "1122";
        joao.idade = 15;

        System.out.println(joao.nome);
        System.out.println(joao.matricula);
        System.out.println(joao.idade);
    }
}
