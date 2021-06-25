package javacore.ZZDthreads.Classes;

import javax.swing.*;

public class EntregadorTest {
    // A palavra Thread Significa fio
    /*
        Em um programa em Java podemos querer executar 2 ou
        mais threads ao mesmo tempo, ou seja, 2 ou mais 
        procedimentos internos do programa ao mesmo tempo
    */
    public static void main(String[] args) {
        ListaMembros listaMembros = new ListaMembros();
        Thread t1 = new Thread(new Entregador(listaMembros), "Entregador 1");
        Thread t2 = new Thread(new Entregador(listaMembros), "Entregador 2");
        t1.start();
        t2.start();
        while (true) {
            String email = JOptionPane.showInputDialog("Digite o email do membro");
            if(email == null || email.isEmpty()) {
                listaMembros.fecharLista();
                break;
            }
            listaMembros.adicionarEmailMembro(email);
        }

    }
}
