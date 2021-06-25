package javacore.Lclassesabstratas.classes;

//Não pode criar uma instância de classe abstrata
public abstract   class Funcionario extends Pessoa {

    protected String clt;
    protected double salario;

    public Funcionario(){

    }
    public Funcionario(String nome, String clt, double salario) {
        this.nome = nome;
        this.clt = clt;
        this.salario = salario;
    }
    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", clt='" + clt + '\'' +
                ", salario=" + salario +
                '}';
    }

    public void imprime() {
        System.out.println("Dentro do imprime de funcionario");
    }

    // se um metodo é abstrato a classe inteira tem que ser abstrato
    public abstract void calculaSalario();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setClt(String clt) {
        this.clt = clt;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getClt() {
        return clt;
    }
}
