package javacore.Lclassesabstratas.Test;

import javacore.Lclassesabstratas.classes.Funcionario;
import javacore.Lclassesabstratas.classes.Gerente;
import javacore.Lclassesabstratas.classes.Vendedor;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("Lewis Hamilton", "7", 90000);
        Vendedor v = new Vendedor("Max Verstappen" , "323", 90000, 500);
        v.calculaSalario();
        g.calculaSalario();
        System.out.println(g);
        System.out.println("---------------");
        System.out.println(v);
    }
}
