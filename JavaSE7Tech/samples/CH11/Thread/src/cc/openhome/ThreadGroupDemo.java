package cc.openhome;

public class ThreadGroupDemo {
    public static void main(String[] args) {
        ThreadGroup tg1 = new ThreadGroup("tg1") {
                @Override
                public void uncaughtException(Thread t, Throwable e) {
                    System.out.printf("%s: %s%n", t.getName(), e.getMessage());
                }
        };
        
        Thread t1 = new Thread(tg1, new Runnable() {
                public void run() {
                    throw new RuntimeException("測試例外");
                }
            }
        ); 
     
        t1.start();
    }    
}
