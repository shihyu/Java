package cc.openhome;

public class ArrayListDemo {
    public static void main(String[] args) {
        final ArrayList list = new ArrayList();
        Thread t1 = new Thread() {
            public void run() {
                while(true) {
                    synchronized(list) {
                        list.add(1);
                    }
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                while(true) {
                    synchronized(list) {
                        list.add(2);
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}