package javacore.Npolimorfismo.classes;

public abstract class Funcionario {
    /*
Protected: O modificador protected deixará visível o 
atributo para todas as outras classes e subclasses que
pertencem ao mesmo pacote. A principal diferença é que apenas
as classes do mesmo pacote têm acesso ao membro. 
O pacote da subclasse não tem acesso ao membro
    */
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    public abstract void calcularPagamento();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
