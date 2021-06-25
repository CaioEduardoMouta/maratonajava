package javacore.Npolimorfismo.test;

import javacore.Npolimorfismo.classes.Funcionario;
import javacore.Npolimorfismo.classes.Gerente;
import javacore.Npolimorfismo.classes.RelatorioPagamento;
import javacore.Npolimorfismo.classes.Vendedor;

public class PolimorfismoTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("Kevin Durant", 60000,200);
        Vendedor v = new Vendedor("Stephen Curry", 22121,99);
        RelatorioPagamento relatorio  = new RelatorioPagamento();
//        relatorio.relatorioPagamentoGerente(g);
//        System.out.println("---------------");
//        relatorio.relatorioPagamentoVendedor(v);

        relatorio.relatorioPagamentoGenerico(g);
        System.out.println("---------------");
        relatorio.relatorioPagamentoGenerico(v);

    }
}
