package javacore.ZZGcomportamentoporparametro.predicate;

import javacore.ZZGcomportamentoporparametro.Interface.CarroPredicate;
import javacore.ZZGcomportamentoporparametro.classes.Carro;

import java.util.Calendar;

public class CarrosDezAnosRecentePredicate implements CarroPredicate {

    @Override
    public boolean test(Carro carro) {
        return carro.getAno() > (Calendar.getInstance().get(Calendar.YEAR) - 10);
    }
}
