package cc.openhome;

import java.util.Arrays;
import java.util.concurrent.locks.*;

public class ArrayList {
    private Lock lock = new ReentrantLock();
    private Object[] list;
    private int next;
   
    public ArrayList(int capacity) {
        list = new Object[capacity];
    }

    public ArrayList() {
        this(16);
    }

    public void add(Object o) {
        try {
            lock.lock();
            if (next == list.length) {
                list = Arrays.copyOf(list, list.length * 2);
            }
            list[next++] = o;
        } finally {
            lock.unlock();
        }
    }
    
    public Object get(int index) {
        try {
            lock.lock();
            return list[index];
        } finally {
            lock.unlock();
        }
    }
    
    public int size() {
        try {
            lock.lock();
            return next;
        } finally {
            lock.unlock();
        }
    }
}
