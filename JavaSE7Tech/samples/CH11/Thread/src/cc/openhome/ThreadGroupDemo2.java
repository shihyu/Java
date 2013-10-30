package cc.openhome;

public class ThreadGroupDemo2 {
    public static void main(String[] args) {        
        ThreadGroup tg1 = new ThreadGroup("tg1");
        Thread t1 = new Thread(tg1, new Runnable() {
                public void run() {
                    throw new RuntimeException("t1 測試例外");
                }
            }
        ); 
        
        t1.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.printf("%s: %s%n", t.getName(), e.getMessage());
            }
        });
     
        Thread t2 = new Thread(tg1, new Runnable() {
                public void run() {
                    throw new RuntimeException("t2 測試例外");
                }
            }
        ); 
        
        t1.start();
        t2.start();
    }    
}
