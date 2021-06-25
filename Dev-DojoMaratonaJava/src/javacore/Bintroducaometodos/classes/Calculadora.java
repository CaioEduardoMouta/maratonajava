package javacore.introducaometodos.classes;

public class Calculadora {
/*
Utilizando os métodos podemos reaproveitar o código.
 Uma vez que o método é criado, o mesmo pode ser usado em 
 diversas partes do sistema.
Os métodos podem receber variáveis como parâmetros e devolver
uma variável como retorno da execução do método.
*/
    public void somaDoisNumeros() {
        System.out.println(5+5);
    }
    public void subtraiDoisNumeros() {
        System.out.println(5-5);
    }
    //Parametros pode ter tipos diferentes
    public void multiplicaDoisNumeros(/*Parametros*/int n1,int n2) {
        System.out.println(n1 * n2);
    }
    /*
os métodos também são capazes de receber um ou mais parâmetros 
que são utilizados no processamento do método.
    */
    public double divideDoisNumeros(double n1, double n2) {
        if(n2 != 0) {
            return n1/n2;
        }
            return 0;
    }
    public void imprimeDoisNumerosDivididos(double n1, double n2) {
        if (n2 != 0) {
            System.out.println(n1/n2);
            return;
        }
        System.out.println("Não é possivel dividir por 0");
    }
    public void alterarDoisNumeros(int n1, int n2) {
        n1 = 30;
        n2 = 40;
        System.out.println("Dentro do Altere dois numeros");
        System.out.println("n1 " +n1);
        System.out.println("n2 " +n2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for(int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    //varargs tem que ser o ultimo parametro
    public void somaVarArgs(int...numeros){
        int soma = 0;
        for(int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
