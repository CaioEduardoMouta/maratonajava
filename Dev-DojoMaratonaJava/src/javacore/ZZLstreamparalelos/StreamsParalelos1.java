package javacore.ZZLstreamparalelos;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamsParalelos1 {
    public static void main(String[] args) {
        long num = 10_000_000_000L;
        somaFor(num);
      //  somaStreamIterate(num);
        somaRangeClosedStreams(num);
        somaRangeClosedParallelStreams(num);
        System.out.println(Runtime.getRuntime().availableProcessors());
        //System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism","12");

    }
    private static void somaFor(long num){
        System.out.println("For");
        long result = 0;
        long init = System.currentTimeMillis();
        for(long i = 1L; i <=num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
    }
    private static void somaStreamIterate (long num){
        System.out.println("Stream Sequencial");
        long result = 0;
        long init = System.currentTimeMillis();
        result = Stream.iterate(1L, i -> i + 1)
                .limit(num)
                .reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
    }

    private static void somaRangeClosedStreams (long num){
        System.out.println("Range Closed Streams ");
        long result = 0;
        long init = System.currentTimeMillis();
        result = LongStream.rangeClosed(1L,num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
    }

    private static void somaRangeClosedParallelStreams (long num){
        System.out.println("Range Closed Parallel Streams ");
        long result = 0;
        long init = System.currentTimeMillis();
        result = LongStream.rangeClosed(1L,num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " ms");
    }

}

//if(tafera for pequena ou não pode ser divididad) {
//faz ela sequencial
//} else {
//    dividir em duas tarefas
//        chamar o meotodo recursivamente
//        esperar todas as tarefas sempre completadas
//        combinar todos os resultados
//
//        }

// tarefa em duas chamadas de fork

