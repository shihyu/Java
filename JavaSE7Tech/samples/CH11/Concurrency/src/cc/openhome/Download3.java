package cc.openhome;

import java.net.URL;
import java.io.*;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Download3 {
    public static void main(String[] args) throws Exception {
        URL[] urls = {
            new URL("http://caterpillar.onlyfun.net/Gossip/Encoding/"),
            new URL("http://caterpillar.onlyfun.net/Gossip/Scala/"),
            new URL("http://caterpillar.onlyfun.net/Gossip/JavaScript/"),
            new URL("http://caterpillar.onlyfun.net/Gossip/Python/")
        };
        
        String[] fileNames = {
            "Encoding.html",
            "Scala.html",
            "JavaScript.html",
            "Python.html"
        };

        ExecutorService executorService = Executors.newCachedThreadPool();
        new Pages(urls, fileNames, executorService).download();
        executorService.shutdown();
    }
}
