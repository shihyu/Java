package cc.openhome;

import java.util.concurrent.BlockingQueue;

public class Producer3 implements Runnable {
    private BlockingQueue<Integer> queue; 
    
    public Producer3(BlockingQueue<Integer> queue) { 
        this.queue = queue; 
    } 
    
    public void run() { 
        System.out.println("生產者開始生產整數......"); 
        for(int product = 1; product <= 10; product++) { 
            try { 
                Thread.sleep((int) (Math.random() * 3000)); 
                queue.put(product);
                System.out.printf("生產者提供整數 (%d)%n", product);
            } 
            catch(InterruptedException ex) { 
                throw new RuntimeException(ex);
            } 
        }       
    } 
}