package javacore.Minterfaces.test;

import javacore.Minterfaces.classes.Produto;

public class TesteProduto {
    public static void main(String[] args) {
        Produto p = new Produto("Notebook", 4, 3000);
        //Interface não são instanciadas
        // Interface em UML = <<interface>> implementar linha tracejada
        p.calculaImposto();
        p.calcularFrete();
        System.out.println(p);
    }
}
