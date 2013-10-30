package cc.openhome;

public class JoinDemo {
    public static void main(String[] args) {
        System.out.println("Main thread 開始...");
        Thread threadB = new Thread() {
            @Override
            public void run() { 
                try { 
                    System.out.println("Thread B 開始..."); 
                    for(int i = 0; i < 5; i++) { 
                        Thread.sleep(1000); 
                        System.out.println("Thread B 執行..."); 
                    }
                    System.out.println("Thread B 將結束..."); 
                } 
                catch(InterruptedException e) { 
                    e.printStackTrace(); 
                } 
            } 
        };
        
        threadB.start();

        try {
            // Thread B 加入 Main thread 流程
            threadB.join();
        } 
        catch(InterruptedException e) { 
            e.printStackTrace(); 
        } 
        System.out.println("Main thread 將結束...");
    }    
}
