package javacore.ZZEconcorrencia.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueTest {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(1);
        //SynchronousQueue
        //DelayQueue

        Thread t1 = new Thread(new RemoveFromQueue(bq));
        bq.put("Caio Mouta");
        System.out.println(bq.peek());
        System.out.println("Tentando colocar outro valor");
        t1.start();
        bq.put("God of War");
        System.out.println("Inserido o último valor");
    }
    static class RemoveFromQueue implements Runnable{
        private  BlockingQueue<String> bq;

        public RemoveFromQueue(BlockingQueue<String> bq) {
            this.bq = bq;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName()+" entrando em espera por 2a");
            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Removendo o valor:" + bq.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
