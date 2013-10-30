package cc.openhome;
import java.util.*;
public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date(System.currentTimeMillis());
        System.out.println(date);
        Date date2 = new Date();
        System.out.println(date2);
        System.out.println(date2.getTime());
    }
            
}
