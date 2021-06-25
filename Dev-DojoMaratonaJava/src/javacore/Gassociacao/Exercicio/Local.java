package javacore.Gassociacao.Exercicio;

public class Local {
    private String rua;
    private String bairro;

    public Local(String rua, String bairro) {
        this.rua = rua;
        this.bairro = bairro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void print () {
        System.out.println("_______Relatorio Local________");
        System.out.println("rua " + this.rua);
        System.out.println("Bairro " + this.bairro);
    }
}
