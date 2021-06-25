package javacore.Lclassesabstratas.classes;

public class Vendedor extends Funcionario{
    private double totalVendas;

    public Vendedor() {

    }
    public Vendedor(String nome, String clt, double salario,double totalVendas) {
        super(nome, clt, salario);
        this.totalVendas = totalVendas;
    }

    @Override
    public void imprime() {
        System.out.println("dentro do metodo imprime");
    }

    @Override
    public void calculaSalario() {
        this.salario = salario + (totalVendas * 0.05);
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public double getTotalVendas() {
        return totalVendas;
    }
}