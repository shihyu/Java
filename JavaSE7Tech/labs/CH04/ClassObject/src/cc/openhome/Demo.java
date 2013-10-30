package cc.openhome;

import java.math.BigDecimal;

public class Demo {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("0.1");
        BigDecimal b = new BigDecimal("0.1");
        BigDecimal c = a;
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(b));
    }
}
