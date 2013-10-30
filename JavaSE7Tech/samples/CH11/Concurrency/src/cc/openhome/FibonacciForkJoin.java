package cc.openhome;

import java.util.concurrent.*;

class Fibonacci extends RecursiveTask<Long> {
   final long n;
   Fibonacci(long n) { this.n = n; }
   public Long compute() {
     if (n <= 10) {
        return Fibonacci.fibonacci(n);
     }
     Fibonacci f1 = new Fibonacci(n - 1);
     f1.fork();
     Fibonacci f2 = new Fibonacci(n - 2);
     return f2.compute() + f1.join();
   }
   static long fibonacci(long n) {
        if(n <= 1) {
            return n;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}

public class FibonacciForkJoin {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci(45);
        ForkJoinPool mainPool = new ForkJoinPool();
        long begin = System.currentTimeMillis();
        System.out.println(mainPool.invoke(fibonacci));
        System.out.println(System.currentTimeMillis() - begin);
    }
}
