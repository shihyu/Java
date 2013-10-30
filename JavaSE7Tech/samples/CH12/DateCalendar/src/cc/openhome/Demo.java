/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cc.openhome;

import java.util.Calendar;

/**
 *
 * @author Justin
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar rightNow = Calendar.getInstance();
        rightNow.roll(Calendar.MONTH, -5);
        System.out.println(rightNow.getTime());
    }
}
