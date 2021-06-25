package ControleDeFluxo;

public class ExercicioSwitch {

    public static void main(String[] args) {
        byte dia = 6;
        //char , int , byte , short, enum e string
        switch (dia) {
            case 1, 7:
                System.out.println("Domingo");
                System.out.println("Final de Semana");
                break;
            case 2, 3, 4, 5, 6:
                System.out.println("Dia Útil");
                break;
            default:
                System.out.println("Valor Invalido");
        }
    }
}
