package cc.openhome;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long sum = 0;
        long number = 0;
        do {
            System.out.print("輸入數字：");
            number = Long.parseLong(scanner.nextLine());
            sum += number;
        } while(number != 0);
        System.out.println("總合：" + sum);
    }
}
