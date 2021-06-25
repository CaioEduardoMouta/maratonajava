package javacore.FmodificadorEstatico.test;

import javacore.FmodificadorEstatico.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Audi", 270);
        Carro c3 = new Carro("Mercedes", 290);

        c1.imprime();
        c2.imprime();
        c3.imprime();

        System.out.println("####################");
        //mudou a velocidade de todos os carros
        //Pertence a classe e não um objeto
        // Estatico não pode ultilizar set
        // c1.setVelocidadeLimite(220);

        Carro.setVelocidadeLimite(300);

        c1.imprime();
        c2.imprime();
        c3.imprime();

    }
}
