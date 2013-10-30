package cc.openhome;

public class Main {   
    public static String a() {
        String text = null;
        return text.toUpperCase();
    }
    public static void b() {
        a();
    }
    public static void c() {
        b();
    }
    public static void main(String[] args) {
        try {
            c();
        } catch(NullPointerException ex) {
            ex.printStackTrace();
        }
    }
}
