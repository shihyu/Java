package cc.openhome;

import java.util.concurrent.locks.*;

public class Clerk {
    private int product = -1; 
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
 
    public void setProduct(int product) {
        try {
            lock.lock();
            while(this.product != -1) { 
                try { 
                    condition.await();
                } catch(InterruptedException ex) { 
                    throw new RuntimeException(ex);
                } 
            }  
            this.product = product; 
            System.out.printf("生產者設定 (%d)%n", this.product); 
            condition.signal();
        } finally {
            lock.unlock();
        }
    } 
    
    public int getProduct() { 
        try {
            lock.lock();
            while(this.product == -1) { 
                try { 
                    condition.await();
                } catch(InterruptedException ex) { 
                    throw new RuntimeException(ex);
                } 
            } 
            int p = this.product; 
            System.out.printf("消費者取走 (%d)%n", this.product); 
            this.product = -1; 
            condition.signal();
            return p; 
        } finally {
            lock.unlock();
        }
    } 
} 