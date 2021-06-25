package javacore.Oexception.runtimeexception.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultiplasRunTimeExceptionTest {
    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException();
//Tratar várias excecoes ultilizando o mesmo bloco
        } catch (IllegalArgumentException | IndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("dentro do" +
                    " ArrayIndexOutOfBoundsException");
        }
//Sempre quando tiver na mesma herança coloca o que for mais generico para baixo
// } catch (RuntimeException e) {
//    System.out.println("dentro do RuntimeException");
// }

        System.out.println("Final do programa");


//    ArithmeticException e IllegalArgumentException são subclasses d
//    RuntimeException e  ArrayIndexOutOfBoundsException é uma subclasse de
//    IndexOutOfBoundsException

        try {
            talvezLanceException();
            //Não pode colocar classe de uma mesma linha de herança
        } catch (SQLException | IOException e) {

        }
    }
    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }

}
