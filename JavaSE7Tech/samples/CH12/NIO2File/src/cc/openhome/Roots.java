package cc.openhome;

import java.nio.file.*;

public class Roots {
    public static void main(String[] args) {
        Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
        for (Path name : dirs) {
            System.out.println(name);
        }
    }
}
