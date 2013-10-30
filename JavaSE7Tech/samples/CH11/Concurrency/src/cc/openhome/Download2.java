package cc.openhome;

import java.net.URL;
import java.io.*;

public class Download2 {
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

        new Pages(urls, fileNames, new ThreadPerTaskExecutor()).download();
    }
}
