package javacore.sobrecargaconstrutores.test;

import javacore.sobrecargaconstrutores.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        /*
Quando usamos a palavra-chave new, estamos passando para ela 
como um parâmetro, qual construtor deve ser executado para instanciar um objeto.
        */
        Estudante est = new Estudante
                ("212311","Mouta", new double[]{7,8,9},"16/07/2019");
        est.imprime();
    }
}
