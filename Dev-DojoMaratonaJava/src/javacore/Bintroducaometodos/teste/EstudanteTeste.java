package javacore.introducaometodos.teste;

import javacore.introducaometodos.classes.Estudante;

public class EstudanteTeste {

    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        //set setar valor
        estudante.setNome("Caio");
        estudante.setIdade(87);
        estudante.setNotas(new double[]{9,8,7});
        estudante.imprimir();
        estudante.media();

        System.out.println("Aprovado ? " +estudante.isAprovado());
        //get usado para buscar valor
        }


}
