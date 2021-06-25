package javacore.Rwrappers.test;

import javax.swing.*;
//Wrappers vem do verbo inglês “wrap” que significa envolver.

public class WrappersTest {
    public static void main(String[] args) {
    //O Java possui oito wrappers para tipos primitivos que 
    //adicionam a funcionalidade de tratar tipos primitivos
    //como classes.   
        byte bytePrimitivo = 1;
        short shortPrimitico = 1;
        int intPrimitivo = 10;
        long longPrimitivo = 10;
        float floatPrimitivo = 10;
        double doublePrimitivo = 10;
        char charPrimitivo = 'A';
        boolean booleanPrimitivo = true;

        Byte byteWrapper = 127;
        Short shortWrapper = 1;
        Integer integerWrapper = new Integer(10);
        Long longWrapper = Long.valueOf("10");
        Float floatWrapper = new Float("10");
        Double doubleWrapper = 10D;
        Character characterWrapper = new Character('A');
        Boolean booleanWrapper = new Boolean("TrUe");

        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetter('1'));
        System.out.println(Character.isLetterOrDigit('#'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.toUpperCase('!'));

        /*
Você já deve ter se imagine que como Wrapper é um Objeto você 
deve sempre passar um tipo primitivo para criar um Wrapper
especifico daquele tipo primitivo
        */
        String valor = "10";
        Float f = Float.parseFloat(valor);
        System.out.println(f);
    }
}
