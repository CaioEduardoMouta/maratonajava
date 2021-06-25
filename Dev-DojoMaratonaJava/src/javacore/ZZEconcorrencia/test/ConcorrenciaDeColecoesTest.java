package javacore.ZZEconcorrencia.test;

import java.util.HashMap;
import java.util.Map;

public class ConcorrenciaDeColecoesTest {
    public static void main(String[] args) {
        //ConcurrentHashMap
        //ConcurrentLinkedDeque
        //ConcurrentLinkQueue
        //ConcurrentSkipListMap
        //ConcurrentSkipListSet

        Map<String,String> map = new HashMap<>();
        map.put("1","1");
        map.putIfAbsent("1","2");
        System.out.println(map.get("1"));
    }
}
