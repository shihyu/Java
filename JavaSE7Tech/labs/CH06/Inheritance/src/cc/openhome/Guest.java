package cc.openhome;

import java.util.Scanner;

public class Guest {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        String name;
        while(true) {
            System.out.print("訪客名稱：");
            name = scanner.nextLine();
            if(name.equals("quit")) {
                break;
            }
            list.add(name);
        }
        System.out.println("訪客名單：");
        for(int i = 0; i < list.size(); i++) {
            String guest = (String) list.get(i);
            System.out.println(guest.toUpperCase());
        }
    }
}
