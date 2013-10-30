package cc.openhome;

import java.util.concurrent.*;

public class ScheduledExecutorServiceDemo {
    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleWithFixedDelay(
            new Runnable() {
                public void run() {
                    System.out.println(new java.util.Date());
                    try {
                        // 假設這個工作會進行兩秒
                        Thread.sleep(2000);
                    } catch (InterruptedException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
        , 2000, 1000, TimeUnit.MILLISECONDS);
    }
}
