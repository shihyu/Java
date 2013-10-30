package cc.openhome;

import java.util.concurrent.locks.*;

public class Clerk2 {
    private int product = -1; 
    private Lock lock = new ReentrantLock();
    private Condition producerSet = lock.newCondition();
    private Condition consumerSet = lock.newCondition();
 
    public void setProduct(int product) {
        try {
            lock.lock();
            while(this.product != -1) { 
                try { 
                    producerSet.await();
                } catch(InterruptedException ex) { 
                    throw new RuntimeException(ex);
                } 
            }  
            this.product = product; 
            System.out.printf("生產者設定 (%d)%n", this.product); 
            consumerSet.signal();
        } finally {
            lock.unlock();
        }
    } 
    
    public int getProduct() { 
        try {
            lock.lock();
            while(this.product == -1) { 
                try { 
                    consumerSet.await();
                } catch(InterruptedException ex) { 
                    throw new RuntimeException(ex);
                } 
            } 
            int p = this.product; 
            System.out.printf("消費者取走 (%d)%n", this.product); 
            this.product = -1; 
            producerSet.signal();
            return p; 
        } finally {
            lock.unlock();
        }
    } 
} 