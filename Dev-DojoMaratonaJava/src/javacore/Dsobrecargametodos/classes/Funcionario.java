package javacore.sobrecargametodos.classes;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private String rg;

    //Construtor caso você não coloca o java coloca
    public Funcionario(String nome, String cpf, double salario,String rg) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.rg = rg;
    }
    //Sobrecarga
    public Funcionario() {

    }

    public void init(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;

    }
    public void init(String nome, String cpf, double salario,String rg) {
        init(nome,cpf,salario);
        this.rg = rg;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public double getSalario() {
        return this.salario;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getRg() {
        return this.rg;
    }



    public void imprime() {
        System.out.println(this.cpf);
        System.out.println(this.nome);
        System.out.println(this.salario);
        System.out.println(this.rg);
    }
}
