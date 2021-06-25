package javacore.Gassociacao.Exercicio;

import javacore.Gassociacao.Exercicio.Professores;
import javacore.Gassociacao.Exercicio.Seminarios;

public class Alunos {
    private String nome;
    private int idade;
    private Seminarios seminarios;
    //private Professores professores[];

    public Alunos(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Alunos() {

    }

    public Seminarios getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminarios seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void print() {
        System.out.println("_______Relatorio Alunos________");
        System.out.println("nome " + this.nome);
        System.out.println("Idade " +this.idade);
        if (this.seminarios != null) {
            System.out.println("Seminario " + this.seminarios.getTitulo());
        }else {
            System.out.println("Aluno não está inscrito em nenhum seminário");
        }
    }
}
