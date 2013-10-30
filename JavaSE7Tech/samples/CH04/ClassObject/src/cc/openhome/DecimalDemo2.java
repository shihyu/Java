package cc.openhome;

import java.math.BigDecimal;

public class DecimalDemo2 {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("0.1");
        BigDecimal b = new BigDecimal("0.1");
        BigDecimal c = new BigDecimal("0.1");
        BigDecimal result = new BigDecimal("0.3");
        if(a.add(b).add(c).equals(result)) {
            System.out.println("等於 0.3");
        }
        else {
            System.out.println("不等於 0.3");
        }
    }
}
