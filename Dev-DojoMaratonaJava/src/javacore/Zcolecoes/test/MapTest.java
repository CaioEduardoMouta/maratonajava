package javacore.Zcolecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        //Não organizado
        // Não pode existir chaves duplicadas
        //LinkedHashMap mantem a ordem de inserção
        Map<String, String> map = new HashMap<>();
        map.put("teklado", "teclado");
        map.put("mouse","muse");
        map.put("vc","você");
        map.put("vc","você2");
        for (String key : map.values()) {
            System.out.println(key);
        }
        for(Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
