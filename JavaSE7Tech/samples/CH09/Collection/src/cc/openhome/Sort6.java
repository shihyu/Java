package cc.openhome;

import java.util.*;

class StringComparator2 implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return -s1.compareTo(s2);
    }
}

public class Sort6 {
    public static void main(String[] args) {
        List words = Arrays.asList("B", "X", "A", "M", "F", "W", "O");
        Collections.sort(words, new StringComparator2());
        System.out.println(words);
    }
}
