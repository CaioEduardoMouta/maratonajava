package javacore.Hheranca.classes;
//Funcionario é uma pessoa
public class Funcionario  extends Pessoa{

    private double salario;
    {
        System.out.println("Bolcoo de inicialização de funcionario 1");
    }
    {
        System.out.println("Bolcoo de inicialização de funcionario 2");
    }
    static{
        System.out.println("Bolcoo de inicialização de estático funcionario");
    }
    public Funcionario(String nome) {
        // não pode colocar linha acima senão dá erro de compilação
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
    }

    public void imprime() {
        super.imprime();
        //System.out.println(super.getNome());
        System.out.println("Salário: " +this.salario);
        imprimeReciboPagamento();
    }

    public void imprimeReciboPagamento() {
        System.out.println("Eu "+super.nome+" recebi o pagamento de "+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
