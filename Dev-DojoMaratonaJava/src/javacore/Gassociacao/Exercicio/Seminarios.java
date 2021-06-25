package javacore.Gassociacao.Exercicio;

public class Seminarios {
    private String titulo;
    private Local local;
    private Professores professores;
    private Alunos alunos[];

    public Seminarios(String titulo) {
        this.titulo = titulo;
    }

    public Seminarios() {

    }



    public void setLocal(Local local) {
        this.local = local;
    }

    public Local getLocal() {
        return local;
    }

    public Professores getProfessores() {
        return professores;
    }

    public void setProfessores(Professores professores) {
        this.professores = professores;
    }

    public void setAlunos(Alunos[] alunos) {
        this.alunos = alunos;
    }

    public Alunos[] getAlunos() {
        return alunos;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void print() {
        System.out.println("_______Relatorio Seminario________");
        System.out.println("Titulo " + this.titulo);

        System.out.println("Professor " + this.professores.getNome());
        if(local != null){
        System.out.println("Rua " + this.local.getRua() + "Bairro "+
                            this.local.getBairro());
        } else {
            System.out.println("Endereço inexistente");
        }
        if(alunos != null && alunos.length != 0) {
        System.out.println("Alunos Participantes");
            for(Alunos aluno : alunos) {
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("Idade: " + aluno.getIdade());
            }
        } else {
            System.out.println("Nenhum aluno no seminário");
        }
    }

}
