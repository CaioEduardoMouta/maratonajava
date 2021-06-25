package javacore.ZZEconcorrencia.test;

import java.sql.SQLOutput;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest {
    public static void main(String[] args) throws InterruptedException {
        TransferQueue<String> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("Barclay Premier"));
        tq.put("Ligue 1");
        System.out.println(tq.offer("La Liga"));
        System.out.println(tq.offer("Bundesliga",10, TimeUnit.MILLISECONDS));
        // Vai bloquear até que esse elemento seja consumido por uma
        //outra Thread
        //tq.transfer("Serie A");
        System.out.println(tq.tryTransfer("MLS"));
        System.out.println(tq.tryTransfer("Eredivisie",1,TimeUnit.SECONDS));
        System.out.println(tq.remainingCapacity());

        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.poll(10, TimeUnit.MILLISECONDS));
        System.out.println(tq.remove());
        System.out.println(tq.take());
    }
}
