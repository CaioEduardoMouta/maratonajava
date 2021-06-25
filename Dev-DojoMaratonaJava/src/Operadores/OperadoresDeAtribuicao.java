package Operadores;

public class OperadoresDeAtribuicao {
    public static void main(String[] args) {
        int salario = 1800;
        int numero = 11;
        //salario = salario + 1000;
        //salario *= 0.1;
        salario = salario + (int) (salario * 0.1);
        numero %= 2;

        System.out.println(salario);
    }
}
