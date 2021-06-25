package javacore.sobrecargametodos.teste;

import javacore.sobrecargametodos.classes.Funcionario;

public class FuncionarioTest {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Mouta","223.326.022-44",
                9888,"333111-x");
        Funcionario funcionario2 = new Funcionario();

        funcionario.imprime();
        funcionario2.imprime();


    }
}
