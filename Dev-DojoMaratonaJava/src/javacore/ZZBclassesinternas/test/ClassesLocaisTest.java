package javacore.ZZBclassesinternas.test;

public class ClassesLocaisTest {
    private String nome = "Chelsea FC";
    public void fazAlgumaCoisa() {
        //Java 7 não funciona e Java 8 funciona
        String sobrenome = "Drogba";
        //abstract criar uma sub-classe pode ser extendida
        //Final não pode ser extendida
        class  Interna{
            public void imprimeNomeExterno() {
                System.out.println(nome);
               // System.out.println(sobrenome);
            }
        }
        Interna in = new Interna();
        in.imprimeNomeExterno();
    }
    public static void main(String[] args) {
        ClassesLocaisTest externa = new ClassesLocaisTest();
        externa.fazAlgumaCoisa();
    }
}
