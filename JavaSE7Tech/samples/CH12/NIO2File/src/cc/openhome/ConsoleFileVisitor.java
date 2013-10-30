package cc.openhome;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.*;
import static java.nio.file.FileVisitResult.*;

public class ConsoleFileVisitor extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path path, BasicFileAttributes attr) {
        printSpace(path);
        System.out.printf("%s%n", path.getFileName());
        return CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path path, 
                               BasicFileAttributes attrs) throws IOException {
        printSpace(path);
        System.out.printf("[%s]%n", path.getFileName());
        return CONTINUE;
    }
    
    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) {
        System.err.println(exc);
        return CONTINUE;
    }

    private void printSpace(Path path) {
         System.out.printf("%" + path.getNameCount() * 2 + "s", "");
    }
}
