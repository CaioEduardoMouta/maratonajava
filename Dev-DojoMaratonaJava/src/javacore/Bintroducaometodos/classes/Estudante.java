package javacore.introducaometodos.classes;

public class Estudante {
    private String nome;
    private int idade;
    private double[] notas;
    private boolean aprovado;

    public Estudante() {

    }

    public Estudante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade < 0) {
            System.out.println("Você não pode fazer isso");
            return;
        }
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public boolean isAprovado() {
        return this.aprovado;
    }

    public void media() {
        if (this.notas == null) {
            System.out.println("Esse aluno não possui notas");
            return;
        }
        double mediaDoAluno = 0;
            for(double nota: this.notas) {
                mediaDoAluno += nota;
            }

        mediaDoAluno = mediaDoAluno /this.notas.length;

        if (mediaDoAluno > 6) {
            this.aprovado = true;
            System.out.println("\nA média é " +mediaDoAluno+ " Aprovado");
        }else{
            this.aprovado = false;
            System.out.println("\nA média é " +mediaDoAluno+ " Reprovado");
        }
    }

    public void imprimir() {
        System.out.println(this.idade);
        System.out.println(this.nome);
        if(notas != null) {
            for(double nota: notas) {
                System.out.print(nota+" ");
            }
        }


    }
}
