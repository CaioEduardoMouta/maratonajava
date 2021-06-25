package javacore.introducaoclasses.test;

import javacore.introducaoclasses.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.modelo = "Fiat Punto";
        carro.placa = "CPM8899";
        carro.velocidadeMaxima = 130f;
        System.out.println(carro.modelo);
        System.out.println(carro.placa);
        System.out.println(carro.velocidadeMaxima);
    }
}
