package javacore.Yserializacao.test;

import javacore.Yserializacao.classes.Aluno;
import javacore.Yserializacao.classes.Turma;

import java.io.*;

public class SerializacaoTest {
    public static void main(String[] args) {
        gravadorObjeto();
        leitorObjeto();
    }
    private static void gravadorObjeto() {
        Turma t = new Turma("Copa 2006");
        Aluno aluno = new Aluno(1L,"Quaresma","2129219012");
        aluno.setTurma(t);
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("aluno.ser"))) {
            oos.writeObject(aluno);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void leitorObjeto() {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("aluno.ser"))) {
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
