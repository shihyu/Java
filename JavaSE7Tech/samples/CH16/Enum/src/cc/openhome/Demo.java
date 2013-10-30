/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cc.openhome;

/**
 *
 * @author Justin
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Action2 action = Action2.valueOf("UP");
        System.out.println(Action2.UP == action);
    }
}
