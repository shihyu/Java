package cc.openhome;

import java.util.*;

interface Request {
    void execute();
}

public class ReuqestQueue {

    public static void main(String[] args) {
        Queue requests = new LinkedList();
        // 模擬將請求加入佇列
        for (int i = 1; i < 6; i++) {
            requests.offer(new Request() {
                public void execute() {
                    System.out.printf("處理資料 %f%n", Math.random());
                }
            });
        }
        process(requests);
    }
    
    private static void process(Queue requests) {
        while(requests.peek() != null) {
            Request request = (Request) requests.poll();
            request.execute();
        }
    }
}
