package ControleDeFluxo;

public class ImpostoIfElse {

    public static void main(String[] args) {
        double salario = 4000.00;
        double imposto = 0;

        if(salario < 1000) {
            imposto = salario * 0.05;
            System.out.println("Imposto de 5% " + imposto);
        } else if(salario >= 1000 && salario < 2000) {
            imposto = salario * 0.10;
            System.out.println("Imposto de 10% " + imposto);
        } else if (salario >= 2000 && salario < 5000) {
            imposto = salario * 0.15;
            System.out.println("Imposto de 15% " + imposto);
        } else if(salario > 5000) {
            imposto = salario * 0.20;
            System.out.println("Imposto de 20% " + imposto);
        }

    }

}
