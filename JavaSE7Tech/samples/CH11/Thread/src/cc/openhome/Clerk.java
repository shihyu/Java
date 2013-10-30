package cc.openhome;

public class Clerk {
    private int product = -1; 
 
    public synchronized void setProduct(int product) { 
        while(this.product != -1) { 
            try { 
                wait(); 
            } catch(InterruptedException ex) { 
                throw new RuntimeException(ex);
            } 
        }  
        this.product = product; 
        System.out.printf("生產者設定 (%d)%n", this.product); 
        notify(); 
    } 
    
    public synchronized int getProduct() { 
        while(this.product == -1) { 
            try { 
                wait(); 
            } catch(InterruptedException ex) { 
                throw new RuntimeException(ex);
            } 
        } 
 
        int p = this.product; 
        System.out.printf("消費者取走 (%d)%n", this.product); 
        this.product = -1; 
        notify(); 
        return p; 
    } 
} 