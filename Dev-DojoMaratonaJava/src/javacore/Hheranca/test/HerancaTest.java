package javacore.Hheranca.test;

import javacore.Hheranca.classes.Endereco;
import javacore.Hheranca.classes.Funcionario;
import javacore.Hheranca.classes.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("David Beckham");
        p.setCpf("111.222.333-44");
        Endereco end = new Endereco();
        end.setBairro("Hala Madrid");
        end.setRua("Rua Galaticos 5");
        p.setEndereco(end);
        p.imprime();
        System.out.println("-----------------------");
        Funcionario f = new Funcionario("Zinedine Zidane");
        f.setCpf("213.412.585-55");
        f.setSalario(99000);
        f.setEndereco(end);
        System.out.println("-----------------------");
        f.imprime();


    }
}
