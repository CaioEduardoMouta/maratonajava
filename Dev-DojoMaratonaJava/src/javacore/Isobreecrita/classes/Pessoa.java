package javacore.Isobreecrita.classes;

public class Pessoa  {
    /*
    Private: O modificador private deixará
     visível o atributo apenas para a classe em que este 
     atributo se encontra.
    */
    private String nome;
    private int idade;

    @Override
    public String toString() {
        return "Nome='" + nome + '\'' +
                ", idade=" + idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
