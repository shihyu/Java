package cc.openhome;

import java.util.*;

public class MapKeyValue3 {
    public static void main(String[] args) {
        Map map = new TreeMap();
        map.put("one", "一");
        map.put("two", "二");
        map.put("three", "三");
        
        Set entries = map.entrySet();
        for(Object o: entries) {
            Map.Entry entry = (Map.Entry) o;
            String key = (String) entry.getKey();
            String value = (String) entry.getValue();
            System.out.printf("(鍵 %s, 值 %s)%n", key, value);
        }
    }
}
