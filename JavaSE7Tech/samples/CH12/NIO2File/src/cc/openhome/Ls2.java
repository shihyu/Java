package cc.openhome;

import java.io.IOException;
import java.nio.file.*;

public class Ls2 {
    public static void main(String[] args) throws IOException {
        // 取得目前工作路徑
        Path path = Paths.get(System.getProperty("user.dir"));
        // 預設使用Glob取得所有檔案
        String syntax = "glob";
        String pattern = "*";
        if(args.length == 2) {
            syntax = args[0];
            pattern = args[1];
        } 
        System.out.println(syntax + ":" + pattern);
        PathMatcher matcher = FileSystems.getDefault()
                                         .getPathMatcher(syntax + ":" + pattern);
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
            for (Path entry : stream) {
                Path fileName = Paths.get(entry.getFileName().toString());
                if(matcher.matches(fileName)) {
                    System.out.println(fileName.getFileName());
                }
            }
        }
    }
}