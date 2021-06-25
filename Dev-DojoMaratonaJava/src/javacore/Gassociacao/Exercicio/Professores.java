package javacore.Gassociacao.Exercicio;

public class Professores {
    private String nome;
    private String especialidade;
   // private Alunos alunos[];
    private Seminarios seminarios[];

    public Professores(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professores() {

    }

    public void setSeminarios(Seminarios[] seminarios) {
        this.seminarios = seminarios;
    }

    public Seminarios[] getSeminarios() {
        return seminarios;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void print() {
        System.out.println("_______Relatorio Professor________");
        System.out.println("nome " + this.nome);
        System.out.println("Especialidade " + this.especialidade);
        if(seminarios != null && seminarios.length != 0) {
            for (Seminarios seminarios: seminarios) {
            System.out.print("Seminario " + seminarios.getTitulo());
            }
            return;
        }
        System.out.println("Professor não vinculado a nenhum seminário");

    }
}
