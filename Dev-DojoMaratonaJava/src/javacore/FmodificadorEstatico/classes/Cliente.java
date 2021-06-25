package javacore.FmodificadorEstatico.classes;

public class Cliente {
    // 0 - Bloco de inicializaocao é executado quando a JVM carregar a classe
    // 1 - Alocado espaço na memoria para o objeto que será criado
    // 2 - Cada atributo de classe é criado e inicializado com seus valores default ou valores explicitos
    // 3 - bloco de inicialização é executado
    // 4 - O construtor é executado
    private static int[] parcelas;
    // vai imprimir primeiro os estaticos
    {
        System.out.println("Não estatico");
    }
    //Executado apenas uma vez quando Static estiver no bloco de inicialização
    static {
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicialição estatico");
        for(int i = 1; i <=100; i++) {
            parcelas[i - 1] = i;
        }
    } static {
        System.out.println("Bloco estatico 2");
    } static {
        System.out.println("Bloco estatico 3");
    }
    public Cliente() {

    }

    public static void setParcelas(int[] parcelas) {
        Cliente.parcelas = parcelas;
    }

    public static int[] getParcelas() {
        return parcelas;
    }
}
