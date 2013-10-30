package cc.openhome;

import java.text.*;
import java.util.*;

public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        DateFormat dateFormat =
                new SimpleDateFormat("EE-MM-dd-yyyy", Locale.TAIWAN);  
        System.out.println(dateFormat.format(new Date())); 
    }
}
