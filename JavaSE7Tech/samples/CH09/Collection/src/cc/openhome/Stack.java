package cc.openhome;

import java.util.*;

public class Stack {
    private Deque deque = new ArrayDeque();
    private int capacity;
    
    public Stack(int capacity) {
        this.capacity = capacity;
    }
    
    public boolean push(Object o) {
        if(deque.size() + 1 > capacity) {
            return false;
        }
        return deque.offerLast(o);
    }
    
    public Object pop() {
        return deque.pollLast();
    }
    
    public Object peek() {
        return deque.peekLast();
    }
    
    public int size() {
        return deque.size();
    }
    
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push("Justin");
        stack.push("Monica");
        stack.push("Irene");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
