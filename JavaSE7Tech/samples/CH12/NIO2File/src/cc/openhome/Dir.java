package cc.openhome;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class Dir {
    public static void main(String[] args) throws IOException {
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(args[0]))) {
            List<String> files = new ArrayList<>();
            for(Path path : stream) {
                if(Files.isDirectory(path)) {
                    System.out.printf("[%s]%n", path.getFileName());
                } 
                else {
                    files.add(path.getFileName().toString());
                }
            }
            for(String file : files) {
                System.out.println(file);
            }
        } 
    } 
}
