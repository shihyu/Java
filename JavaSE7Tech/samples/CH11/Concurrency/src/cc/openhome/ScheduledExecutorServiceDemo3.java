package cc.openhome;

import java.util.concurrent.*;

public class ScheduledExecutorServiceDemo3 {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleAtFixedRate(
            new Runnable() {
                public void run() {
                    System.out.println(new java.util.Date());
                    try {
                        // 假設這個工作會進行0.5秒
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        , 2000, 1000, TimeUnit.MILLISECONDS);
    }
}
