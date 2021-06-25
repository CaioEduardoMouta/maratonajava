package Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        //byte, short, int , long, float , double = 0
        // char ' '
        //boolean false;
        //String null
        String [] nome = new String[4];
        nome[0] = "Tekken";
        nome[1] = "The King of Fighter";
        nome[2] = "Street Fighter";
        nome[3] = "Mortal Kombat";

        for(int i = 0; i < nome.length; i++) {
            System.out.println((i + 1) + " nome " +nome[i]);
        }

        
    }
}
