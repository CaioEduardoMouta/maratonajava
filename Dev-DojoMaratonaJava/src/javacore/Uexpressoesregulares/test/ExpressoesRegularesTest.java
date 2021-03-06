package javacore.Uexpressoesregulares.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest {

    public static void main(String[] args) {
        // \d - todos os digitos
        // \D tudo que não for digito
        // \s espaços em branco \t \n \f \r
        // \S caractere que não é branco
        // \w caracteres de palavras a-z A-Z, digitos e _
        // \W tudo o que não for caractere de palavra
        // [] procurar letra especifica ou numeros
        // ? zero ou uma
        // * zero ou mais
        // + uma ou mais
        // {n,m} de n ate m
        // ( )
        // | ou
        // $ - Fim de linha
        //o(v|c)o = ovo , oco
        //maca(rr|c)ão = macarrão ou macacão
        //. coringa
        // ^ caracter de negação você fala o que não quer q apareça
        int hex = 0x1;
//        String regex = "0[xX] ([0-9a-fA-F])+(\\s|$)";
////      String texto = "12 0x 0X 0x01FFABC 0x10G 0x1";
//        String regex = "([\\w\\.])+@([a-zA-Z])+\\.([a-zA-Z]+)+";
//        String texto = "fulano@gmail.com , 213bc@gmail.com, " +
//        "#@!abrao@mail.br, teste@gmail.br, teste@mail";
//        String regex = "\\d{2}/\\d{2}/\\d{2,4}";
//        String texto = "05/10/2010 05/05/2015 1/1/01 01/05/95";

        String regex = "proj([^,])*";
        String texto = "proj1.bkp, pro1.java, proj1.class, proj1.final, " +
                "proj12.bkp, proj3.java";
        System.out.println("Email valido? "+ "#@!abrao@mail.br".matches(regex));
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto: " + texto);
        System.out.println("indice: 012345678901234567");
        System.out.println("expressao: " +matcher.pattern());
        System.out.println("posicoes encontradas");
        while(matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }


    }
}
