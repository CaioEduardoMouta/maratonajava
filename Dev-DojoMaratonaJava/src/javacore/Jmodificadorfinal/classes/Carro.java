package javacore.Jmodificadorfinal.classes;

public class Carro {
    // é obrigado a inicializar o valor e a letra tem que ser uppercase
    // Não pode ser mudado
    public static final double VELOCIDADE_LIMITE = 200;
    public final Comprador comprador = new Comprador();
    private String nome;
    private String marca;

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }

    //Não pode ser sobrescrito
    public final void imprime() {
        System.out.println("imprimindo um carro");
    }

    public Comprador getComprador() {
        return comprador;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
