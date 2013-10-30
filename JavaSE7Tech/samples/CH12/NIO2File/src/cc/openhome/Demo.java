package cc.openhome;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.Path;
import java.nio.file.attribute.*;

public class Demo {

    public static void main(String[] args) throws IOException {
        DirectoryStream.Filter<Path> filter = new DirectoryStream.Filter<>() {
            public boolean accept(Path path) throws IOException {
                return (Files.isDirectory(path));
            }
        };
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(
                        Paths.get(args[0]), filter)) {
            for (Path entry : stream) {
                System.out.println(entry.getFileName());
            }
        }
    }
}
