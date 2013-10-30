/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */package cc.openhome;

public class FibonacciNoForkJoin {
    public static long fibonacci(long n) {
        if(n <= 1) {
            return n;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        System.out.println(fibonacci(45));
        System.out.println(System.currentTimeMillis() - begin);
    }
}