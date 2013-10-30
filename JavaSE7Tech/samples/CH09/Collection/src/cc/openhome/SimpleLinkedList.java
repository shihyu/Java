package cc.openhome;

public class SimpleLinkedList {
    private class Node {
        Node(Object o) {
            this.o = o;
        }
        Object o;
        Node next;
    }
    
    private Node first;

    public void add(Object o) {
        if(first == null) {
            first = new Node(o);
        }
        else {
            Node last = first;
            while(last.next != null) {
                last = last.next;
            }
            last.next = new Node(o);
        }
    }
    
    public int size() {
        int count = 0;
        Node last = first;
        while(last.next != null) {
            last = last.next;
            count++;
        }
        return count;
    }
    
    public Object get(int index) {
        int size = size();
        if(index >= size) {
            throw new IndexOutOfBoundsException(
                    String.format("Index: %d, Size: %d", index, size));
        }
        int count = 0;
        Node last = first;
        while(count < index) {
            last = last.next;
            count++;
        }
        return last.o;
    }
}
