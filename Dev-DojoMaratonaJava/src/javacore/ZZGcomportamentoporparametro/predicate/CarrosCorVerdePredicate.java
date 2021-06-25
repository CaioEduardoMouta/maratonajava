package javacore.ZZGcomportamentoporparametro.predicate;

import javacore.ZZGcomportamentoporparametro.Interface.CarroPredicate;
import javacore.ZZGcomportamentoporparametro.classes.Carro;

public class CarrosCorVerdePredicate implements CarroPredicate {

    @Override
    public boolean test(Carro carro) {
        return carro.getCor().equals("verde");
    }
}
