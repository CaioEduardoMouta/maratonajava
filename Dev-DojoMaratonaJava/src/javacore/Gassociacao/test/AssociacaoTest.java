package javacore.Gassociacao.test;

import javacore.Gassociacao.Exercicio.Alunos;
import javacore.Gassociacao.Exercicio.Local;
import javacore.Gassociacao.Exercicio.Professores;
import javacore.Gassociacao.Exercicio.Seminarios;

public class AssociacaoTest {

    public static void main(String[] args) {

        Alunos alunos = new Alunos("Caio",133);
        Alunos alunos1 = new Alunos("Mouta",212);

        Seminarios seminarios = new Seminarios("Como ser Programador");

        Professores professores = new Professores("Chico Buarque", "Programar cantando");
        Local local = new Local("Rua Sem-Mundial " , "Palmeiras");

        alunos.setSeminarios(seminarios);
        alunos1.setSeminarios(seminarios);
        //alunos.print();
        seminarios.setProfessores(professores);
       // seminarios.setLocal(local);
        seminarios.setAlunos(new Alunos[]{alunos,alunos1});

        Seminarios[] seminarios1 = new Seminarios[1];
        seminarios1[0] = seminarios;
        professores.setSeminarios(seminarios1);

        seminarios.print();
        professores.print();
        alunos.print();
        local.print();

    }
}
