package cc.openhome;

import java.nio.file.*;

public class Demo {
    public static void main(String[] args) {
         Path path = Paths.get(System.getProperty("user.home"), "Documents", "Downloads");
         System.out.println(path);
    }
}
