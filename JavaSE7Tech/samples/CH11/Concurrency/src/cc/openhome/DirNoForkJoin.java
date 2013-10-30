/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cc.openhome;

import java.io.*;
import java.nio.file.*;
import java.util.*;

/**
 *
 * @author Justin
 */
public class DirNoForkJoin {
    public static void dir(Path path, String pattern) {
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
            for (Path subPath : stream) {
                if(Files.isDirectory(subPath)) {
                    dir(subPath, pattern);
                } 
                else if(subPath.toString().endsWith(pattern)) {
                    System.out.println(subPath.toString());
                }
            }
        } catch (IOException | DirectoryIteratorException x) {
            // 略過無法存取的目錄
        }
    }

    public static void main(String[] args) {
        Path path = Paths.get(args[0]);
        long begin = System.currentTimeMillis();
        
        dir(path, args[1]);
        
        System.out.println(System.currentTimeMillis() - begin);
    }
}
