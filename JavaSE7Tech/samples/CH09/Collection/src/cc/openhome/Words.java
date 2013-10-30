package cc.openhome;

import java.util.*;

public class Words {
    public static void main(String[] args) {
        Set words = new HashSet();
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入英文：");
        String line = scanner.nextLine();
        String[] tokens = line.split(" ");
        for(String token : tokens) {
            words.add(token);
        }
        System.out.printf("不重複單字有 %d 個：%s%n",
                words.size(), words);
    }
}
