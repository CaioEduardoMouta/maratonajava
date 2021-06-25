package javacore.ZZCjdbc.test;

import javacore.ZZCjdbc.classes.Comprador;
import javacore.ZZCjdbc.db.CompradorDBOLD;

import java.util.List;

public class TesteConexao {
    public static void main(String[] args) {
        //deletar();
       // atualizar();
        //List<Comprador> listaComprador = selecionarTudo();
        //List<Comprador> Comprador = buscarPorNome("Mouta");
        //System.out.println(listaComprador2);
       // CompradorDBOLD.selectMetaData();
       //CompradorDBOLD.checkDriverStatus();
      //CompradorDBOLD.teastTypeScroll();
      //CompradorDBOLD.updateNomesToLowerCase();
       // System.out.println(CompradorDBOLD.searchByNamePreparedStatement("OUTA"));
       // CompradorDBOLD.updatePreparedStatement(new Comprador(1,"212.383.948-21","Pep Guardiola"));
       // System.out.println(CompradorDBOLD.searchByNameCallableStatement("%AUDIO%"));
       // System.out.println(CompradorDBOLD.searchByNameRowSet("Anc"));
        //CompradorDBOLD.updateRowSet(new Comprador(1,"999.111.222-21","Marcelo Bielsa"));
        //CompradorDBOLD.updateRowSetCached(new Comprador(1,"888.777.222-21","Julian Nagelsmann"));
        CompradorDBOLD.saveTransaction();

    }

    public static void inserir() {
        Comprador comprador = new Comprador("221212133","Mouta");
        CompradorDBOLD compradorDB = new CompradorDBOLD();
        compradorDB.save(comprador);
    }
    public static void deletar() {
        Comprador comprador = new Comprador();
        comprador.setId(2);
        CompradorDBOLD.delete(comprador);
    }

    public static void atualizar() {
        Comprador comprador = new Comprador(1,"30380921211","Caio Mouta");
        CompradorDBOLD.update(comprador);
    }

    public static List<Comprador> selecionarTudo() {
        return CompradorDBOLD.selectAll();
    }
    public static List<Comprador> buscarPorNome(String nome) {
        return CompradorDBOLD.searchByName(nome);
    }

}
