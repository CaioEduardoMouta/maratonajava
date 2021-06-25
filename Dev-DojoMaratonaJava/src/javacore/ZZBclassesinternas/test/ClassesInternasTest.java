package javacore.ZZBclassesinternas.test;

public class ClassesInternasTest {
    private String nome = "Caio pai da Maya";

//    O modo non strict FP foi criado para dar maior precisão
//    em cálculos em arquiteturas com implementações de ponto
//    flutuante com maior precisão da que o Java usa.
//    Isto é o padrão do Java.
//
//    Mas isto trouxe problemas de compatibilidade de valores calculados
//    dependendo de onde a execução é feita.
    class Interna{
        public void verClasseExterna(){
            System.out.println(nome);
            System.out.println(this);
            System.out.println(ClassesInternasTest.this);
        }
    }

    public static void main(String[] args) {
        ClassesInternasTest externa = new ClassesInternasTest();
        ClassesInternasTest.Interna in = externa.new Interna();
        ClassesInternasTest.Interna in2 = new ClassesInternasTest().new Interna();
        in.verClasseExterna();
       // in2.verClasseExterna();
    }
}

//class Externa {
//    private String nome = "Caio papi da Maya";
//
//    class Interna{
//        public void verClasseExterna(){
//            System.out.println(nome);
//        }
//    }
//}
