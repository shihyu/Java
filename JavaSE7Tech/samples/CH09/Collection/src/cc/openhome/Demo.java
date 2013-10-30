package cc.openhome;
import java.util.*;
public class Demo {
   public static void main(String[] args) {
       String[] words = {"RADAR","WARTER START","MILK KLIM","RESERVERED","IWI"};
       for(String word : words) {
           Deque<Character> deque = new LinkedList<Character>();
           for(Character c : word.toCharArray()) {
               deque.offer(c);
           }
           
           Character c1, c2;
           boolean isReversedWord = true;
           while((c1 = deque.pollFirst()) != null && (c2 = deque.pollLast()) != null) {
               if(!c1.equals(c2)) {
                   isReversedWord = false;
                   break;
               }
           }
           if(isReversedWord) {
               System.out.println(word);
           }
       }
    }   
}
