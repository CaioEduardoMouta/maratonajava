package javacore.ZZCjdbc.db;

import javacore.ZZCjdbc.classes.Carro;
import javacore.ZZCjdbc.classes.Comprador;
import javacore.ZZCjdbc.conn.ConexaoFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarroDAO {
    public static void save(Carro carro) {
        String sql = "INSERT INTO `agencia`.`carro`(`nome`,`placa`, `compradorid`) VALUES(?,?, ?)";

        try (Connection conn = ConexaoFactory.getConexao();
             PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1,carro.getNome());
            ps.setString(2,carro.getPlaca());
            ps.setInt(3,carro.getComprador().getId());
            // ps.setInt(3,carro.getId());
            ps.executeUpdate();
            System.out.println("Registro inserido com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void delete(Carro carro) {
        if(carro == null || carro.getId() == null) {
            System.out.println("Não foi possivel excluir o registro");
            return;
        }
        String sql = "DELETE FROM `agencia`.`carro` WHERE `id` = ?";
        try (Connection conn = ConexaoFactory.getConexao();
             PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setInt(1, carro.getId());
            ps.executeUpdate();
            System.out.println("Registro excluido com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void update(Carro carro) {
        if(carro == null || carro.getId() == null) {
            System.out.println("Não foi possivel atualizar o registro");
            return;
        }
        String sql = "UPDATE `agencia`.`carro` SET `placa` = ?, `nome` = ? WHERE `id` = ? ";
        try (Connection conn = ConexaoFactory.getConexao();
             PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1,carro.getPlaca());
            ps.setString(2,carro.getNome());
            ps.setInt(3,carro.getId());
            ps.executeUpdate();
            System.out.println("Registro atualizado com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static List<Carro> selectAll() {
        String sql = "select id, nome, placa, compradorid from agencia.carro";
        List<Carro> carroList = new ArrayList<>();
        try (Connection conn = ConexaoFactory.getConexao();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()){
            while (rs.next()) {
                Comprador c = CompradorDAO.searchById(rs.getInt("compradorid"));
                carroList.add(new Carro
                        (rs.getInt("id"),
                                rs.getString("nome"),
                                rs.getString("placa"), c));

            }
            return carroList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Carro> searchByName(String nome) {
        String sql = "select id, nome, placa, compradorid from agencia.carro where nome like ? ";
        List<Carro> carroList = new ArrayList<>();
        try (Connection conn = ConexaoFactory.getConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, "%"+nome+ "%");
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                Comprador c = CompradorDAO.searchById(rs.getInt("compradorid"));
                carroList.add(new Carro
                        (rs.getInt("id"),
                                rs.getString("placa"),
                                rs.getString("nome"),c));

            }
            ConexaoFactory.close(conn,ps,rs);
            return carroList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
