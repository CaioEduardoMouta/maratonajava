package javacore.introducaometodos.classes;

public class Professor {
    public String nome;
    public String matricula;
    public String rg;
    public String CPF;

    public void imprime() {
        System.out.println(this.CPF);
        System.out.println(this.matricula);
        System.out.println(this.rg);
        System.out.println(this.nome);
        System.out.println("------------");
        this.nome = "Diego Lugano";
        System.out.println(this.nome);
    }

}
