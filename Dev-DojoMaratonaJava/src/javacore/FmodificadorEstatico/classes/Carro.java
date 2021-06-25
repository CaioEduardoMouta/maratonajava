package javacore.FmodificadorEstatico.classes;

public class Carro {
    //Velocidade limite deve ser de 240KM/H
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 240;

    public  Carro(String nome, double velocidadeMaxima){
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }
    // Pode colocar metodo estatico quando não está acessando atributo
    // Ou quando o atributo for estatico
    // Exemplo classe calculadora pode ser tudo metodo estatico
    public void imprime() {
        System.out.println("_________________");
        System.out.println("Nome " + this.nome);
        System.out.println("Velocidade Maxima" + this.velocidadeMaxima);
        System.out.println("Velocidade Limite" + velocidadeLimite);
    }

    public Carro () {

    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        //this associados a um objeto
        // Carro associados a classe e não um objeto
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
