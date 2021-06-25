package javacore.Oexception.checkedexception.test;

import javacore.Oexception.customexceptions.LoginInvalidoException;

public class CustomExceptionTest {

    public static void main(String[] args) {
        try {
            logar();
        } catch(LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        String usuarioBancoDedados = "Rafael Nadal";
        String senhaBancoDeDados = "Roland Garros";
        String usuarioDigitado = "Rafael Nadal";
        String senhaDigitada = "Gran Slam";
        if(!usuarioBancoDedados.equals(usuarioDigitado) ||
                !senhaBancoDeDados.equals(senhaDigitada)) {
            throw new LoginInvalidoException();
        }else{
            System.out.println("Logado");
        }
    }
}
