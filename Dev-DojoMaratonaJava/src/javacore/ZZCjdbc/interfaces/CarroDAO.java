package javacore.ZZCjdbc.interfaces;

import javacore.ZZCjdbc.classes.Carro;

import java.util.List;

public interface CarroDAO {
    void save(Carro caro);

    void delete(Carro carro);

    void update(Carro carro);

    List<Carro> selectAll();

    List<Carro> searchByName(String nome);
}
