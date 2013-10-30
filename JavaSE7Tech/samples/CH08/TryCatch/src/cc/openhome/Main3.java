package cc.openhome;

public class Main3 {
    public static String a() {
        String text = null;
        return text.toUpperCase();
    }
    public static void b() {
        a();
    }
    public static void c() {
        try {
            b();
        } catch(NullPointerException ex) {
            ex.printStackTrace();
            Throwable t = ex.fillInStackTrace();
            throw (NullPointerException) t;
        }
    }
    public static void main(String[] args) {
        try {
            c();
        } catch(NullPointerException ex) {
            ex.printStackTrace();
        }
    }    
}
