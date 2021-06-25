package javacore.sobrecargaconstrutores.classes;

public class Estudante {
    private String matricula;
    private String nome;
    private double[] notas;
    private String dataMatricula;

    /*
        Isso é um construtor vazio , que por padrão o 
        proprio java já cria,
        Para que um método seja considerado construtor, 
        ele deve possuir o mesmo nome da classe, inclusive 
        com correspondência entre letras maiúsculas e minúsculas
        e não deve ter retorno.
    */
    public Estudante() {
        System.out.println("Construtor default");
    }
    /*
        Isso é um construtor com três parametros recebendo duas 
        Strings e um double
    */
    public Estudante(String matricula,String nome, double[] notas) {
        this.matricula = matricula;
        this.nome = nome;
        this.notas = notas;
    }
    public Estudante(String matricula,String nome, double[] notas, String dataMatricula) {
        this(matricula,nome,notas);
        this.dataMatricula = dataMatricula;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.matricula);
        for(double nota:notas) {
            System.out.println(nota + " ");
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
}
