package cc.openhome;

import java.util.*;

public class Average2 {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            double sum = 0;
            int count = 0;
            int number;
            while (true) {
                number = scanner.nextInt();
                if (number == 0) {
                    break;
                }
                sum += number;
                count++;
            }
            System.out.printf("平均 %.2f%n", sum / count);
        } catch (InputMismatchException ex) {
            System.out.println("必須輸入整數");
        }
    }
}
