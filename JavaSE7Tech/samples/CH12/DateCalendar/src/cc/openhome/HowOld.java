package cc.openhome;

import java.util.*;
import java.text.*;

public class HowOld {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        DateFormat dateFormat = 
            new SimpleDateFormat("yyyy-mm-dd");
        
        System.out.print("輸入出生年月日（yyyy-mm-dd）：");
        Date birth = dateFormat.parse(scanner.nextLine());
        Date current = new Date();
        long life = current.getTime() - birth.getTime();
        System.out.println("你今年的歲數為：" + 
                  (life / (365 * 24 * 60 * 60 * 1000L)));
    }
}