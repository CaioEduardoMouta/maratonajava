package javacore.introducaometodos.teste;

import javacore.introducaometodos.classes.Calculadora;

public class ParametroTeste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int n1 = 5;
        int n2 = 10;
        calc.alterarDoisNumeros(n1,n2);
        System.out.println("Dentro do Teste");
        System.out.println("n1 " +n1);
        System.out.println("n2 " +n2);

    }
}
