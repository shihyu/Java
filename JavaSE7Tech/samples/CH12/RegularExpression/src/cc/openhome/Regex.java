package cc.openhome;

import java.util.*;
import java.util.regex.*;

public class Regex {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("輸入規則表示式：");
            Pattern pattern = Pattern.compile(scanner.nextLine());
            System.out.print("輸入要比對的文字：");
            Matcher matcher = pattern.matcher(scanner.nextLine());
            boolean isFound = false;
            while(matcher.find()) {
                System.out.printf(
                        "從索引 %d 開始到索引 %d 之間找到符合文字 \"%s\"%n",
                        matcher.start(), matcher.end(), matcher.group());
                isFound = true;
            }
            if(!isFound){
                System.out.println("找不到符合文字");
            }
        } catch(PatternSyntaxException ex) {
                System.out.println("規則表示式有誤");
                System.out.println(ex.getMessage());
        }
    }
}