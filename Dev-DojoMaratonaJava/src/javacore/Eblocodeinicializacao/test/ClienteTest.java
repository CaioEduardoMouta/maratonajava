package javacore.Eblocodeinicializacao.test;

import javacore.Eblocodeinicializacao.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        System.out.println("Exibindo");

        for(int parcela : c.getParcelas()) {
            System.out.println(parcela + " ");

        }
    }
}
