package javacore.Jmodificadorfinal.test;

import javacore.Jmodificadorfinal.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c = new Carro();
        System.out.println(c.getComprador());
        c.getComprador().setNome("Dwayne Johnson - THE ROCK");
        System.out.println(c.getComprador());
        // Não pode criar uma nova referencia comprador

    }
}
