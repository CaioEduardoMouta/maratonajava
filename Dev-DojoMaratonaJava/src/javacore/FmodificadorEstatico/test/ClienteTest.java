package javacore.FmodificadorEstatico.test;


import javacore.FmodificadorEstatico.classes.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        System.out.println("Exibindo");

        //for(int parcela : c.getParcelas()) {
        //    System.out.print(parcela + " ");

        //}

        System.out.println("Tamanho: " + Cliente.getParcelas().length);
        System.out.println("Tamanho: " + Cliente.getParcelas().length);
        System.out.println("Tamanho: " + Cliente.getParcelas().length);
    }
}
