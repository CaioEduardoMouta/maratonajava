package javacore.Kenum.classes;

public class Cliente {
    /*
    A estrutura de uma Enum é bem semelhante à de uma classe comum.
    Toda a Enum possui um construtor que pode ou não ser
    sobrecarregado
    Uma enum, diferentemente de uma classe, já é inicializada
    quando você inicia sua aplicação Java, não necessitando
    ser instanciada
    */
    public enum TipoPagamento {
        AVISTA, APRAZO
    }
    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipo, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipo;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo= " + tipoCliente.getNome() +
                ", tipoPagamento= " + tipoPagamento +
                ", numero= " +tipoCliente.getTipo() +
                '}';
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getNome() {
        return nome;
    }

    public TipoCliente getTipo() {
        return tipoCliente;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipoCliente = tipoCliente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
