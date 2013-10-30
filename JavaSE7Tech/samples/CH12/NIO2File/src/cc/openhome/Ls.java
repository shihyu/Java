package cc.openhome;

import java.io.IOException;
import java.nio.file.*;

public class Ls {

    public static void main(String[] args) throws IOException {
        // 取得目前工作路徑
        Path path = Paths.get(System.getProperty("user.dir"));
        // 預設取得所有檔案
        String glob = "*";
        if(args.length != 0) {
            glob = args[0];
        } 
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(
                        path, glob)) {
            for (Path entry : stream) {
                System.out.println(entry.getFileName());
            }
        }
    }
}
