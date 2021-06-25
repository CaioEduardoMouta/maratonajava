package javacore.Oexception.checkedexception.test;

import javacore.Oexception.checkedexception.classes.Leitor1;
import javacore.Oexception.checkedexception.classes.Leitor2;

import java.io.*;

public class TryWithResourcesTest {
    public static void main(String[] args) {
    lerArquivo2();
    }

    public static void lerArquivo2() {
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {

        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Lança a exceção dentro do metodo sem lançar o catch
    public static void lerArquivo() throws IOException{
        try(Reader reader = new BufferedReader(new FileReader("text.txt"))) {
        }
    }

    public static void lerArquivoOld() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("text.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
        }
}
