/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cc.openhome;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Justin
 */
public class Demo {
    public static void main(String[] args) {
Logger onlyfunLogger = Logger.getLogger("only.fun");
        Logger caterpillarLogger = 
                     Logger.getLogger("only.fun.caterpillar");

        System.out.println("root logger: " 
                    + onlyfunLogger.getParent());
        System.out.println("onlyfun logger: " 
                    + caterpillarLogger.getParent().getName());

        System.out.println("caterpillar logger: " 
                   + caterpillarLogger.getName() + "\n");
        
        onlyfunLogger.setLevel(Level.WARNING);
        caterpillarLogger.info("caterpillar' info");
        
        caterpillarLogger.setLevel(Level.INFO);
        caterpillarLogger.info("caterpillar' info");

    }
}
