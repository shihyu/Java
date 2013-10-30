package cc.openhome;

public class SortDemo {
    public static void main(String[] args) {
       Sort<String> sort = new Sort<>();
       String[] strs = {"3", "2", "5", "1"};
       sort.quick(strs);
       for(String s : strs) {
           System.out.println(s);
       } 
    }
}
