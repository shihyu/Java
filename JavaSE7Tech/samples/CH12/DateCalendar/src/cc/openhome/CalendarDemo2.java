package cc.openhome;

import java.util.*;
import static java.util.Calendar.*;

public class CalendarDemo2 {
    public static void main(String[] args) {
        Calendar rightNow = Calendar.getInstance();
       
        System.out.println("現在時間是：");
        System.out.printf("%s%d %n",
           rightNow.getDisplayName(ERA, LONG, Locale.TAIWAN),
           rightNow.get(YEAR));
        System.out.println(
           rightNow.getDisplayName(MONTH, LONG, Locale.TAIWAN));
        System.out.printf("%d日%n", 
           rightNow.get(DAY_OF_MONTH));
        System.out.println(
           rightNow.getDisplayName(DAY_OF_WEEK, LONG, Locale.TAIWAN));
    }   
}

