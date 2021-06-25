package javacore.Lclassesabstratas.classes;

public abstract class Pessoa {
    protected String nome;
    /*
    Pode-se dizer que as classes abstratas servem como “modelo” para
    outras classes que dela herdem, não podendo ser instanciada por
    si só. Para ter um objeto de uma classe abstrata é necessário 
    criar uma classe mais especializada herdando dela e então 
    instanciar essa nova classe. Os métodos da classe abstrata 
    devem então serem sobrescritos nas classes filhas
    */

    public abstract void imprime();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
