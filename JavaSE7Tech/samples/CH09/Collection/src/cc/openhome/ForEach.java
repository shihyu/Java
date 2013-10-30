package cc.openhome;

import java.util.*;

public class ForEach {
    private static void forEach(Iterable iterable) {
        for(Object o : iterable) {
            System.out.println(o);
        }
    }
    
    public static void main(String[] args) {
        List list = Arrays.asList("Justin", "Monica", "Irene");
        forEach(list);
        forEach(new HashSet(list));
        forEach(new ArrayDeque(list));
    }
}
