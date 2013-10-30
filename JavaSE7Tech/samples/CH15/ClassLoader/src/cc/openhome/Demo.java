package cc.openhome;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Demo {
    public static void main(String[] args) throws Exception {
        URL url = new URL("file:/d:/workspace/");
ClassLoader loader = new URLClassLoader(new URL[] {url});
Class clz = loader.loadClass("cc.openhome.Some");
System.err.print(clz.getClassLoader() == loader);
    }
}
