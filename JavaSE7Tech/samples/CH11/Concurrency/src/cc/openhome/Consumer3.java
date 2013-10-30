package cc.openhome;

import java.util.concurrent.BlockingQueue;

public class Consumer3 implements Runnable {
     private BlockingQueue<Integer> queue; 
    
    public Consumer3(BlockingQueue<Integer> queue) { 
        this.queue = queue; 
    } 
    
    public void run() { 
        System.out.println("消費者開始消耗整數......"); 
        for(int i = 1; i <= 10; i++) { 
            try { 
                Thread.sleep((int) (Math.random() * 3000)); 
                int product = queue.take();
                System.out.printf("消費者消費整數 (%d)%n", product);
            } catch(InterruptedException ex) { 
                throw new RuntimeException(ex);
            } 
        } 
    } 
 } 
