package cc.openhome;

class Variable2 {
    static int i = 0, j = 0;
    static synchronized void one() { i++; j++; }
    static synchronized void two() {
        System.out.printf("i = %d, j = %d%n", i, j);
    }
}

public class Variable2Test {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                while(true) {
                    Variable2.one();
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                while(true) {
                    Variable2.two();
                }
            }
        };
        t1.start();
        t2.start();
    }
}
