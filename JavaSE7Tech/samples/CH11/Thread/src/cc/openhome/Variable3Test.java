package cc.openhome;

class Variable3 {
    volatile static int i = 0, j = 0;
    static void one() { i++; j++; }
    static void two() {
        System.out.printf("i = %d, j = %d%n", i, j);
    }
}

public class Variable3Test {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                while(true) {
                    Variable3.one();
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                while(true) {
                    Variable3.two();
                }
            }
        };
        t1.start();
        t2.start();
    }
}
