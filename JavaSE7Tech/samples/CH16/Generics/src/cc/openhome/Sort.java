package cc.openhome;

public class Sort<T extends Comparable<T>> {
    public void quick(T[] array) {
        sort(array, 0, array.length-1);
    }
    
    private void sort(T[] array, int left, int right) {
        if(left < right) { 
            int q = partition(array, left, right); 
            sort(array, left, q-1); 
            sort(array, q+1, right); 
        } 

    }

    private int partition(T[] array, int left, int right) {  
        int i = left - 1; 
        for(int j = left; j < right; j++) { 
            if(array[j].compareTo(array[right]) <= 0) {
                i++; 
                swap(array, i, j); 
            } 
        } 
        swap(array, i+1, right); 
        return i + 1; 
    } 

    private void swap(T[] array, int i, int j) {
        T t = array[i]; 
        array[i] = array[j]; 
        array[j] = t;
    }
}