package Arrays;

public class Arrays3 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int[] numeros2 = {1,2,3,4,5}; // tam =5 , indice 0 á 4
        int[] numero = new int[/* Não pode colocar numero aqui*/]{1,2,3,4,5};

  //      for(int i =0; i< numeros2.length; i++) {
  //          System.out.println(numeros2[i]);
  //      }

        //Não colocar o mesmo nome da variavel fora do escopo
        //int aux;
        for (int aux : numeros2) {
            System.out.println(aux);
        }
    }
}
