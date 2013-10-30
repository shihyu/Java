package cc.openhome;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class ClassLoaderDemo {
    public static void main(String[] args) {
        try {
            String path = args[0];    // 測試路徑
            String clzName = args[1]; // 測試類別
            
            URL url1 = new URL(path);
            ClassLoader loader1 = new URLClassLoader(new URL[] {url1});
            Class clz1 = loader1.loadClass(clzName);
            System.out.println(clz1);

            URL url2 = new URL(path);
            ClassLoader loader2 = new URLClassLoader(new URL[] {url2});
            Class clz2 = loader2.loadClass(clzName);
            System.out.println(clz2);

            System.out.printf("clz1 與 clz2 為%s實例", clz1 == clz2 ? "相同" : "不同");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("沒有指定類別載入路徑與名稱");
        } catch (MalformedURLException e) {
            System.out.println("載入路徑錯誤");
        } catch (ClassNotFoundException e) {
            System.out.println("找不到指定的類別");
        }
    }
}
