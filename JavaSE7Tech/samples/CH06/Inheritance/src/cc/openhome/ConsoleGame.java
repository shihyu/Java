package cc.openhome;

import java.util.Scanner;

public class ConsoleGame extends GuessGame {
    private Scanner scanner = new Scanner(System.in);
    
    @Override
    public void print(String text) {
        System.out.print(text);
    }

    @Override
    public void println(String text) {
        System.out.println(text);
    }

    @Override
    public int nextInt() {
        return scanner.nextInt();
    }
}
