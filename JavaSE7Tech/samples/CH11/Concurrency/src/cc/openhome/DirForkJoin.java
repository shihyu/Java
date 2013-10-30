package cc.openhome;


import java.nio.file.*;
import java.util.concurrent.RecursiveAction;
import java.io.*;
import java.util.*;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

class SubDir extends RecursiveAction {
    Path path;
    String pattern;
    SubDir(Path path, String pattern) {
        this.path = path;
        this.pattern = pattern;
    }
    @Override
    protected void compute() {
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
            List<SubDir> subDirs = new java.util.ArrayList<>();
            for (Path subPath : stream) {
                if(Files.isDirectory(subPath)) {
                    subDirs.add(new SubDir(subPath, pattern));
                }
                else if(subPath.toString().endsWith(pattern)) {
                    System.out.println(subPath.toString());
                }
            }
            ForkJoinTask.invokeAll(subDirs);
        } catch (IOException | DirectoryIteratorException ex) {
            // 略過無法存取的目錄
        }
    }
}

public class DirForkJoin {
    public static void main(String[] args) {
        ForkJoinPool mainPool = new ForkJoinPool();
        SubDir subDir = new SubDir(Paths.get(args[0]), args[1]);
        long begin = System.currentTimeMillis();
        mainPool.invoke(subDir);
        System.out.println(System.currentTimeMillis() - begin);
    }
}
