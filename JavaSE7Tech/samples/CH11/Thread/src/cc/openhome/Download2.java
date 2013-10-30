package cc.openhome;

import java.net.URL;
import java.io.*;

public class Download2 {
    public static void main(String[] args) throws Exception {
        final URL[] urls = {
            new URL("http://caterpillar.onlyfun.net/Gossip/Encoding/"),
            new URL("http://caterpillar.onlyfun.net/Gossip/Scala/"),
            new URL("http://caterpillar.onlyfun.net/Gossip/JavaScript/"),
            new URL("http://caterpillar.onlyfun.net/Gossip/Python/")
        };
        
        final String[] fileNames = {
            "Encoding.html",
            "Scala.html",
            "JavaScript.html",
            "Python.html"
        };

        for(int i = 0; i < urls.length; i++) {
            final int index = i;
            new Thread() {
                @Override
                public void run() {
                    try {
                        dump(urls[index].openStream(), new FileOutputStream(fileNames[index]));
                    } catch(IOException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }.start();
        }
    }
    
    private static void dump(InputStream src, OutputStream dest)
                               throws IOException {
        try (InputStream input = src; OutputStream output = dest) {
            byte[] data = new byte[1024];
            int length = -1;
            while ((length = input.read(data)) != -1) {
                output.write(data, 0, length);
            }
        }
    }
}
