package cc.openhome;

import java.nio.file.*;

public class PathDemo2 {
    public static void main(String[] args) {
        Path path = Paths.get(System.getProperty("user.home"),
                               "Documents", "Downloads");
        for(Path p : path) {
            System.out.println(p);
        }
    }
}
