package cc.openhome;

import java.text.DateFormat;
import java.util.*;

public class DateFormatDemo {
    public static void main(String[] args) {
        DateFormat dateFormat = null;
        Date date = new Date();
        
        System.out.println("getDateInstance():");
        dateFormat = DateFormat.getDateInstance(
                DateFormat.LONG, Locale.TAIWAN);
        System.out.println(dateFormat.format(date));
        dateFormat = DateFormat.getDateInstance(
                DateFormat.SHORT, Locale.TAIWAN);
        System.out.println(dateFormat.format(date));
        
        System.out.println("getTimeInstance():");
        dateFormat = DateFormat.getTimeInstance(
                DateFormat.LONG, Locale.TAIWAN);
        System.out.println(dateFormat.format(date));
        dateFormat = DateFormat.getTimeInstance(
                DateFormat.MEDIUM, Locale.TAIWAN);
        System.out.println(dateFormat.format(date));
        dateFormat = DateFormat.getTimeInstance(
                DateFormat.SHORT, Locale.TAIWAN);
        System.out.println(dateFormat.format(date));
        
        System.out.println("getDateTimeInstance():");
        dateFormat = DateFormat.getDateTimeInstance(
                DateFormat.LONG, DateFormat.LONG, Locale.TAIWAN);
        System.out.println(dateFormat.format(date));
        dateFormat = DateFormat.getDateTimeInstance(
                DateFormat.SHORT, DateFormat.MEDIUM, Locale.TAIWAN);
        System.out.println(dateFormat.format(date));
        dateFormat = DateFormat.getDateTimeInstance(
                DateFormat.SHORT, DateFormat.SHORT, Locale.TAIWAN);
        System.out.println(dateFormat.format(date));
    }
}
