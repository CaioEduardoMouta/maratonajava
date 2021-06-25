package javacore.ZZCjdbc.db;

import javacore.ZZCjdbc.classes.Comprador;
import javacore.ZZCjdbc.conn.ConexaoFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CompradorDAO {
    public static void save(Comprador comprador) {
        String sql = "INSERT INTO `agencia`.`comprador`(`cpf`,`nome`) VALUES(?,?)";

        try (Connection conn = ConexaoFactory.getConexao();
            PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1,comprador.getCpf());
            ps.setString(2,comprador.getNome());
           // ps.setInt(3,comprador.getId());
            ps.executeUpdate();
            System.out.println("Registro inserido com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void delete(Comprador comprador) {
        if(comprador == null || comprador.getId() == null) {
            System.out.println("Não foi possivel excluir o registro");
            return;
        }
        String sql = "DELETE FROM `agencia`.`comprador` WHERE `id` = ?";
        try (Connection conn = ConexaoFactory.getConexao();
            PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, comprador.getId());
            ps.executeUpdate();
            System.out.println("Registro excluido com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void update(Comprador comprador) {
        if(comprador == null || comprador.getId() == null) {
            System.out.println("Não foi possivel atualizar o registro");
            return;
        }
        String sql = "UPDATE `agencia`.`comprador` SET `cpf` = ?, `nome` = ? WHERE `id` = ? ";
        try (Connection conn = ConexaoFactory.getConexao();
             PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1,comprador.getCpf());
            ps.setString(2,comprador.getNome());
            ps.setInt(3,comprador.getId());
            ps.executeUpdate(sql);
            System.out.println("Registro atualizado com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static List<Comprador> selectAll() {
        String sql = "select id, nome, cpf from agencia.comprador";
        List<Comprador> listaComprador = new ArrayList<>();
        try (Connection conn = ConexaoFactory.getConexao();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()){
            while (rs.next()) {
                listaComprador.add(new Comprador
                        (rs.getInt("id"),
                                rs.getString("cpf"),
                                rs.getString("nome")));

            }
            return listaComprador;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Comprador> searchByName(String nome) {
        String sql = "select id, nome, cpf from agencia.comprador where nome like ? ";
        List<Comprador> compradorList = new ArrayList<>();
        try (Connection conn = ConexaoFactory.getConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {
             ps.setString(1, "%"+nome+ "%");
             ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                compradorList.add( new Comprador
                        (rs.getInt("id"),
                                rs.getString("cpf"),
                                rs.getString("nome")));

            }
            ConexaoFactory.close(conn,ps,rs);
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static Comprador searchById(Integer id) {
        String sql = "select id, nome, placa, compradorid from agencia.comprador where nome like ? ";
        Comprador comprador = null;
        try (Connection conn = ConexaoFactory.getConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if(rs.next()) {
                comprador = new Comprador
                        (rs.getInt("id"),
                                rs.getString("cpf"),
                                rs.getString("nome"));

            }
            ConexaoFactory.close(conn,ps,rs);
            return comprador;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
