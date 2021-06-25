package javacore.Oexception.checkedexception.test;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;

/*
A linguagem Java possui um mecanismo especial para o tratamento de
 erros que possam ocorrer em tempo de execução do programa. 
 Diferentemente de outras linguagens, o surgimento de um erro 
 ocasiona a interrupção imediata do programa, porém em Java 
 podemos tratar esta situação de erro de uma forma adequada e 
 evitando, assim, a interrupção do programa.

Uma exceção, basicamente é uma classe de Java representada na sua 
forma mais genérica pela classe java.lang.Exception, logo todas as 
exceções que ocorram ao longo da execução do seu programa podem ser 
tratadas como objetos do tipo Exception.
*/

public class CheckedExceptionTest {
    public static void main(String[] args) throws IOException {
        abrirArquivo();

    }

    public static void criarArquivo() throws IOException{
        File file = new File("Teste.txt");
        try {
            System.out.println("Arquivo criado ? " + file.createNewFile());
            System.out.println("Arquivo criado");
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static String abrirArquivo() {
        try {
//Finally sempre será executado independente do try e catch
// Nunca pode criar um try sozinho precisa sempre de catch ou finally
            System.out.println("Abrindo um arquivo");
            System.out.println("Executando a leitura do arquivo");
           // throw new Exception();
            System.out.println("Escrevendo no arquivo");
            return "valor";
        } catch (Exception e) {
            System.out.println("Dentro do Catch");
            e.printStackTrace();
        } finally {
            System.out.println("Fechar o arquivo");
        }
        return null;
    }
}


/*
Tipos de erros
ArithmeticException: indica situações de erros em processamento 
aritmético, tal como uma divisão inteira por 0. A divisão de um 
valor real por 0 não gera uma exceção (o resultado é o valor infinito);

NumberFormatException: indica que tentou-se a conversão de uma
string para um formato numérico, mas seu conteúdo não representava 
adequadamente um número para aquele formato. É uma subclasse de 
IllegalArgumentException;

IndexOutOfBounds: indica a tentativa de acesso a um elemento de um 
agregado aquém ou além dos limites válidos. É a superclasse de 
ArrayIndexOutOfBoundsException, para arranjos, e de 
StringIndexOutOfBounds, para strings;

NullPointerException: indica que a aplicação tentou usar uma referência
 a um objeto que não foi ainda definida;

ClassNotFoundException: indica que a máquina virtual Java tentou
carregar uma classe mas não foi possível encontrá-la durante a 
execução da aplicação.
*/