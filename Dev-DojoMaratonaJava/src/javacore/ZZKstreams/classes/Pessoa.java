package javacore.ZZKstreams.classes;

import java.util.List;
import java.util.Objects;

import static java.util.Arrays.asList;

public class Pessoa {
    private String nome;
    private int idade;
    private double salario;
    private Genero genero;

    public Pessoa(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public Pessoa(String nome, int idade, double salario, Genero genero) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.genero = genero;
    }

    public static List<Pessoa> bancoDePessoas() {
        return asList(
                new Pessoa("Eletronic Arts",52,622000, Genero.BOM),
                new Pessoa("Activision",29,2900,Genero.BOM),
                new Pessoa("RockStar",31,2200, Genero.RUIM),
                new Pessoa("Square Enix",72,2100,Genero.RUIM),
                new Pessoa("Ubisoft",10,2800,Genero.BOM),
                new Pessoa("Namco",14,9400, Genero.BOM),
                new Pessoa("Capcom",22,7400,Genero.RUIM),
                new Pessoa("Konami",98,8800,Genero.RUIM),
                new Pessoa("Sony",36,72200,Genero.BOM)
                );

    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return nome != null ? nome.equals(pessoa.nome) : pessoa.nome == null;
    }

    @Override
    public int hashCode() {
        return 0;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Genero getGenero() {
        return genero;
    }
}
