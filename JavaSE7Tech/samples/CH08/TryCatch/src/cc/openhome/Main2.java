package cc.openhome;

public class Main2 {
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
            throw ex;
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
