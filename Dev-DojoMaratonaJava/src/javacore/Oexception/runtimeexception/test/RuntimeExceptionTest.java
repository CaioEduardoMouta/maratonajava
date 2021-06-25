package javacore.Oexception.runtimeexception.test;

import java.io.IOException;

public class RuntimeExceptionTest {
    public static void main(String[] args) {
        try{
            divisao(10,0);
        } catch(RuntimeException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static void  divisao(int num1, int num2) {
        if(num2 == 0) {
            throw new IllegalArgumentException("Passa um valor diferente de 0");
        }
        int resultado = num1 /num2;
        System.out.println(resultado);
    }
}
