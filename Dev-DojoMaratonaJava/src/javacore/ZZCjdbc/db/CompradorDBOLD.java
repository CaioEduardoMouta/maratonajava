package javacore.ZZCjdbc.db;

import javacore.ZZCjdbc.classes.Comprador;
import javacore.ZZCjdbc.classes.MyRowSetListener;
import javacore.ZZCjdbc.conn.ConexaoFactory;

//import javax.xml.transform.Result;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CompradorDBOLD {
    public static void save(Comprador comprador) {
        String sql = "INSERT INTO `agencia`.`comprador`(`cpf`,`nome`) " +
                    "VALUES ('"+comprador.getCpf() +"','"+ comprador.getNome()+"');";
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement stmt = conn.createStatement();
            System.out.println(stmt.executeUpdate(sql));
            ConexaoFactory.close(conn, stmt);
            System.out.println("Registro inserido com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void saveTransaction() {
        String sql = "INSERT INTO `agencia`.`comprador`(`cpf`,`nome`) VALUES ('TESTE1','TESTE1')";
        String sql2 = "INSERT INTO `agencia`.`comprador`(`cpf`,`nome`) VALUES ('TESTE2','TESTE2')";
        String sql3 = "INSERT INTO `agencia`.`comprador`(`cpf`,`nome`) VALUES ('TESTE3','TESTE3')";
        Savepoint savepoint = null;
        Connection conn = ConexaoFactory.getConexao();
        try {
            conn.setAutoCommit(false);
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            savepoint = conn.setSavepoint("ONE");
            conn.releaseSavepoint(savepoint);
            stmt.executeUpdate(sql2);
            if(true)
            throw new SQLException();
            stmt.executeUpdate(sql3);
            conn.commit();
            ConexaoFactory.close(conn, stmt);
            System.out.println("Registro inserido com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
           // conn.rollback(savepoint);
           // conn.commit();
        }
    }

    public static void delete(Comprador comprador) {
        if(comprador == null || comprador.getId() == null) {
            System.out.println("Não foi possivel excluir o registro");
            return;
        }
        String sql = "DELETE FROM `agencia`.`comprador` WHERE `id` = '"+comprador.getId()+"'";
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement stmt = conn.createStatement();
            System.out.println(stmt.executeUpdate(sql));
            ConexaoFactory.close(conn, stmt);
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
        String sql = "UPDATE `agencia`.`comprador` SET `cpf` = '"+comprador.getCpf()+"', `nome` = '"+comprador.getNome()+"' WHERE `id` = '"+comprador.getId()+"'";
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement stmt = conn.createStatement();
            System.out.println(stmt.executeUpdate(sql));
            ConexaoFactory.close(conn, stmt);
            System.out.println("Registro atualizado com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void updatePreparedStatement(Comprador comprador) {
        if(comprador == null || comprador.getId() == null) {
            System.out.println("Não foi possivel atualizar o registro");
            return;
        }
        String sql = "UPDATE `agencia`.`comprador` SET `cpf` = ?, `nome` = ? WHERE `id` = ? ";
        Connection conn = ConexaoFactory.getConexao();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,comprador.getCpf());
            ps.setString(2,comprador.getNome());
            ps.setInt(3,comprador.getId());
            ps.executeUpdate();
            System.out.println(ps.executeUpdate(sql));
            ConexaoFactory.close(conn, ps);
            System.out.println("Registro atualizado com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void updateRowSet(Comprador comprador) {
        if(comprador == null || comprador.getId() == null) {
            System.out.println("Não foi possivel atualizar o registro");
            return;
        }
        //String sql = "UPDATE `agencia`.`comprador` SET `cpf` = ?, `nome` = ? WHERE `id` = ? ";
        String sql = "SELECT * FROM comprador where id = ?";
        JdbcRowSet jrs = ConexaoFactory.getRowSetConnection();
        jrs.addRowSetListener(new MyRowSetListener());
        try {
            jrs.setCommand(sql);
//            jrs.setString(1,comprador.getCpf());
//            jrs.setString(2,comprador.getNome());
            jrs.setInt(1,comprador.getId());
            jrs.execute();
            jrs.next();
            jrs.updateString("nome","SIMEONE");
            jrs.updateRow();
            ConexaoFactory.close(jrs);
            System.out.println("Registro atualizado com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void updateRowSetCached(Comprador comprador) {
        if(comprador == null || comprador.getId() == null) {
            System.out.println("Não foi possivel atualizar o registro");
            return;
        }
        String sql = "SELECT * FROM comprador where id = ?";
        CachedRowSet crs = ConexaoFactory.getRowSetConnectionCached();
        try {
            crs.setCommand(sql);
//            jrs.setString(1,comprador.getCpf());
//            jrs.setString(2,comprador.getNome());
            crs.setInt(1,comprador.getId());
            crs.execute();
            crs.next();
            crs.updateString("nome","Renato Gaúcho");
            crs.updateRow();
            //Thread.sleep(8000);
            crs.acceptChanges();
            System.out.println("Registro atualizado com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static List<Comprador> selectAll() {
        String sql = "select id, nome, cpf from agencia.comprador";
        Connection conn = ConexaoFactory.getConexao();
        List<Comprador> listaComprador = new ArrayList<>();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                listaComprador.add(new Comprador
                        (rs.getInt("id"),
                                rs.getString("cpf"),
                                rs.getString("nome")));

            }
            ConexaoFactory.close(conn, stmt, rs);
            return listaComprador;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

        public static List<Comprador> searchByName(String nome) {
            String sql = "select id, nome, cpf from agencia.comprador where nome like '%"+ nome +"%'";
            Connection conn = ConexaoFactory.getConexao();
            List<Comprador> compradorList = new ArrayList<>();
            try {
                Statement stmt = conn.createStatement();

                ResultSet rs = stmt.executeQuery(sql);
                while(rs.next()) {
                    compradorList.add( new Comprador
                            (rs.getInt("id"),
                                    rs.getString("cpf"),
                                    rs.getString("nome")));

                }
                ConexaoFactory.close(conn,stmt,rs);
                return compradorList;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
    }

    public static List<Comprador> searchByNamePreparedStatement(String nome) {
        String sql = "select id, nome, cpf from agencia.comprador where nome like ?";
        Connection conn = ConexaoFactory.getConexao();
        List<Comprador> compradorList = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,"%"+nome+"%");
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
// Não pode ultilizar comandos update e nem insert com RowSet
    public static List<Comprador> searchByNameRowSet(String nome) {
        String sql = "select id, nome, cpf from agencia.comprador where nome like ?";
        JdbcRowSet jrs = ConexaoFactory.getRowSetConnection();
        jrs.addRowSetListener(new MyRowSetListener());
        List<Comprador> compradorList = new ArrayList<>();
        try {
            jrs.setCommand(sql);
            jrs.setString(1, "%"+ nome + "%");
            jrs.execute();
            //PreparedStatement ps = conn.prepareStatement(sql);
            while(jrs.next()) {
                compradorList.add( new Comprador
                        (jrs.getInt("id"),
                                jrs.getString("cpf"),
                                jrs.getString("nome")));

            }
            ConexaoFactory.close(jrs);
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static List<Comprador> searchByNameCallableStatement(String nome) {
        String sql = "CALL `agencia`.`SP_GetCompradoresPorNome`(?);";
        Connection conn = ConexaoFactory.getConexao();
        List<Comprador> compradorList = new ArrayList<>();
        try {
            CallableStatement cs = conn.prepareCall(sql);
            cs.setString(1,"%"+nome+"%");
            ResultSet rs = cs.executeQuery();
            while(rs.next()) {
                compradorList.add( new Comprador
                        (rs.getInt("id"),
                                rs.getString("cpf"),
                                rs.getString("nome")));

            }
            ConexaoFactory.close(conn,cs,rs);
            return compradorList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void selectMetaData() {
        String sql = "select * from agencia.comprador";
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            rs.next();
            int qtdColunas = rsmd.getColumnCount();
            System.out.println("Quantidades coluna" +qtdColunas);
            for (int i = 1; 1 <= qtdColunas ; i++) {
                System.out.println("tabela " +rsmd.getTableName(i));
                System.out.println("Nome coluna: "+rsmd.getColumnName(i));
                System.out.println("Tamanho coluna " +rsmd.getColumnDisplaySize(i));
            }
            ConexaoFactory.close(conn,stmt,rs);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void checkDriverStatus() {
        Connection conn = ConexaoFactory.getConexao();

        try{
            DatabaseMetaData dbmd = conn.getMetaData();
            if(dbmd.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)){
                System.out.println("Suporta TYPE_FORWARD_ONLY");
                if(dbmd.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println(" e também suporta CONCUR_UPDATABLE");
                }
            }
            if(dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)){
                System.out.println("Suporta TYPE_SCROLL_INSENSITIVE");
                if(dbmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println(" e também suporta CONCUR_UPDATABLE");
                }
            }
            if(dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)){
                System.out.println("Suporta TYPE_SCROLL_SENSITIVE");
                if(dbmd.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    System.out.println(" e também suporta CONCUR_UPDATABLE");
                }
            }
            ConexaoFactory.close(conn);
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void teastTypeScroll() {
        String sql = "SELECT id, nome, cpf FROM agencia.comprador";
        Connection conn = ConexaoFactory.getConexao();
        try {
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.isLast()) {
                System.out.println("Ultima linha " + new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
                System.out.println("Numero ultima linha: " + rs.getRow());
            }
            System.out.println("retornou para a primeira linha " + rs.isFirst());
            System.out.println("Primeira linha: " + rs.getRow());
            rs.absolute(4);
            System.out.println("Linha 4 " + new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
            rs.relative(-1);
            System.out.println("Linha 3 " + new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
            System.out.println(rs.isLast());
            System.out.println(rs.isFirst());
            rs.isLast();
            System.out.println("+++++++++++++++");
            while (rs.previous()) {
                System.out.println(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
            }

            ConexaoFactory.close(conn, stmt, rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateNomesToLowerCase() {
        String sql = "select id, nome, cpf from agencia.comprador";
        Connection conn = ConexaoFactory.getConexao();

        try {
            DatabaseMetaData dbmb = conn.getMetaData();
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(sql);
            System.out.println(dbmb.updatesAreDetected(ResultSet.TYPE_SCROLL_INSENSITIVE));
            System.out.println(dbmb.insertsAreDetected(ResultSet.TYPE_SCROLL_INSENSITIVE));
            System.out.println(dbmb.deletesAreDetected(ResultSet.TYPE_SCROLL_INSENSITIVE));
            while (rs.next()) {
                rs.updateString("nome",rs.getString("nome").toUpperCase());
             //   rs.cancelRowUpdates();
                rs.updateRow();

//                if(rs.rowUpdated()) {
//                    System.out.println("Linha atualizada");
//                }
            }
           rs.absolute(2);
           String nome = rs.getString("nome");
           rs.moveToInsertRow();
           rs.updateString("nome", nome.toUpperCase());
           rs.updateString("cpf","222.222.222-11");
           rs.insertRow();
           rs.moveToCurrentRow();
            System.out.println(rs.getString("nome")+ "row" + rs.getRow());
            rs.absolute(8);
            rs.deleteRow();
            //            rs.beforeFirst();
//            while (rs.next()) {
//                System.out.println(rs.getString("nome"));
//
//            }
            ConexaoFactory.close(conn, stmt, rs);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    }



