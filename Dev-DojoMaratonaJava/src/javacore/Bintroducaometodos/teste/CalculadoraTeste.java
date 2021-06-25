package javacore.introducaometodos.teste;

import javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        calc.multiplicaDoisNumeros(/*Argumento*/5,5);
        System.out.println("Divisão de dois numeros");
        double result = calc.divideDoisNumeros(20,2);
        System.out.println(result);
        System.out.println("Imprimindo dois numeros divididos");
        calc.imprimeDoisNumerosDivididos(20,0);
        System.out.println("Continuando a exec");

        int [] numeros = {1,2,3,4,5};
        calc.somaArray(numeros);
        calc.somaVarArgs(1,2,3,4,5);
    }
}
