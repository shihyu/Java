package cc.openhome;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayList<E> {
    private Object[] list;
    private int next;
   
    public ArrayList(int capacity) {
        list = new Object[capacity];
    }

    public ArrayList() {
        this(16);
    }

    public void add(E e) {
        if(next == list.length) {
            list = Arrays.copyOf(list, list.length * 2);
        }
        list[next++] = e;
    }
    
    public E get(int index) {
        return (E) list[index];
    }
    
    public int size() {
        return next;
    }
    
     public E[] toArray() {
         E[] elements = null;
         if(size() > 0) {
             elements = (E[]) Array.newInstance(list[0].getClass(), size());
             for(int i = 0; i < elements.length; i++) {
                 elements[i] = (E) list[i];
             }
         }
         return elements;
     }
}
