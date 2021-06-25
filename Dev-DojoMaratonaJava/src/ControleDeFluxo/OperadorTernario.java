package ControleDeFluxo;

public class OperadorTernario {

    public static void main(String[] args) {
        int idade = 20;
        String status;

        //Certo
        status = idade < 18 ? "Não adulto": "adulto";
        System.out.println(status);
    }

}
