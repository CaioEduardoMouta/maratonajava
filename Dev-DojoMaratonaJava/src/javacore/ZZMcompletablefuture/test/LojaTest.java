package javacore.ZZMcompletablefuture.test;

import javacore.ZZMcompletablefuture.classes.Loja;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class LojaTest {
    public static void main(String[] args) {
        Loja mandubim = new Loja();
        Loja hot = new Loja();
        Loja vitapower = new Loja();
        Loja powerone = new Loja();
//        long start = System.currentTimeMillis();
//        System.out.println(mandubim.getPreco());
//        System.out.println(hot.getPreco());
//        System.out.println(vitapower.getPreco());
//        System.out.println(powerone.getPreco());
//        System.out.println(System.currentTimeMillis() - start + " ms");
        long start = System.currentTimeMillis();
        Future<Double> amendoim1 = mandubim.getPrecoAsyncTunado();
        Future<Double> amendoim2 = hot.getPrecoAsyncTunado();
        Future<Double> amendoim3 = vitapower.getPrecoAsyncTunado();
        Future<Double> amendoim4 = powerone.getPrecoAsyncTunado();
        long end = System.currentTimeMillis();
        System.out.println("Tempo de invocação " + (end - start) + " ms");
        enrolando();
        try {
            System.out.println("Mandubim " + amendoim1.get());
            System.out.println("Hot " + amendoim2.get());
            System.out.println("Vita Power " + amendoim3.get());
            System.out.println("Power One " + amendoim4.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("Tempo que levou para pegar o resultado "
        + (System.currentTimeMillis()-start) + " ms" );
    }

    private static void enrolando() {
        long soma = 0;
        for (int i = 0; i < 1_000_000; i++) {
            soma += i;
        }
        System.out.println(soma);
    }
}
