package cc.openhome;

import java.util.*;

public class Messages {
    public static void main(String[] args) {
        Map<String, String> messages = new HashMap<>(); 
        messages.put("Justin", "Hello！Justin的訊息！");
        messages.put("Monica", "給Monica的悄悄話！");
        messages.put("Irene", "Irene的可愛貓喵喵叫！");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("取得誰的訊息：");
        String message = messages.get(scanner.nextLine());
        System.out.println(message);
        System.out.println(messages);
    }
}
