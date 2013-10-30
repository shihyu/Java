package cc.openhome;

public class Shift {
    public static void main(String[] args) {
        int number = 1; 
        System.out.printf( "2 的 0 次方: %d%n", number); 

        number = number << 1; 
        System.out.printf( "2 的 1 次方: %d%n", number); 

        number = number << 1; 
        System.out.printf( "2 的 2 次方: %d%n", number); 

        number = number << 1; 
        System.out.printf( "2 的 3 次方: %d%n", number); 
    }
}
