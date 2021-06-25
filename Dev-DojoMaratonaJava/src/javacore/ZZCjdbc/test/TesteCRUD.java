package javacore.ZZCjdbc.test;

import javacore.ZZCjdbc.classes.Comprador;
import javacore.ZZCjdbc.db.CompradorDAO;

import java.util.List;
import java.util.Scanner;

public class TesteCRUD {
    private static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int op;
        while(true) {
            menu();
            op = Integer.parseInt(teclado.nextLine());
            if(op == 0) {
                System.out.println("Saindo do Sistema");
                break;
            }
            if(op == 1) {
                menuComprador();
                op = Integer.parseInt(teclado.nextLine());
                CompradorCRUD.executar(op);
            }
            if(op == 2) {
                menuCarro();
                op = Integer.parseInt(teclado.nextLine());
                CarroCRUD.executar(op);
            }
        }
    }

    public static void menu() {
        System.out.println("Selecione uma opção:");
        System.out.println("1. Comprador");
        System.out.println("2. Carro");
        System.out.println("0, Sair");
    }

    private static void menuComprador() {
        System.out.println("Digite a opção para começar");
        System.out.println("1, Inserir");
        System.out.println("2, Atualizar");
        System.out.println("3, Listar");
        System.out.println("4, Buscar");
        System.out.println("5, Deletar");
        System.out.println("9, Voltar");
    }
    private static void menuCarro() {
        System.out.println("Digite a opção para começar");
        System.out.println("1, Inserir Carrp");
        System.out.println("2, Atualizar Carro");
        System.out.println("3, Listar Carro");
        System.out.println("4, Buscar Carro");
        System.out.println("5, Deletar Carro");
        System.out.println("9, Voltar");
    }


}
