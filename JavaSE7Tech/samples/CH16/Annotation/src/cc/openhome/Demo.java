/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cc.openhome;

import java.util.*;

/**
 *
 * @author Justin
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>(); 
        List<String> list2 = new ArrayList<String>();
        Util.<List<String>>doSome(list1, list2);
    }
}
