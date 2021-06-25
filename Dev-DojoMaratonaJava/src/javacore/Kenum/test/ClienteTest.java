package javacore.Kenum.test;

import javacore.Kenum.classes.Cliente;
import javacore.Kenum.classes.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Lebron James",
                TipoCliente.PESSOA_FISICA,
                Cliente.TipoPagamento.APRAZO);
        System.out.println(TipoCliente.PESSOA_JURIDICA.getId());
        System.out.println(TipoCliente.PESSOA_FISICA.getId());
        System.out.println(cliente);
    }
}
