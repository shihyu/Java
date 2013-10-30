package cc.openhome;

class Variable1 {
    static int i = 0, j = 0;
    static void one() { i++; j++; }
    static void two() {
        System.out.printf("i = %d, j = %d%n", i, j);
    }
}

public class Variable1Test {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                while(true) {
                    Variable1.one();
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                while(true) {
                    Variable1.two();
                }
            }
        };
        t1.start();
        t2.start();
    }
}
