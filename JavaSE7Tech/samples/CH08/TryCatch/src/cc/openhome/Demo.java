package cc.openhome;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws Exception {
        System.out.println(FileUtil.readFile("c:\\workspace\\Main.java"));
    }
    
    
    public static void doSome(String arg) 
            throws FileNotFoundException, EOFException {
        try {
            if("one".equals(arg)) {
                throw new FileNotFoundException();
            } else {
                throw new EOFException();
            }
        } catch(IOException ex) {
            
            
            ex.printStackTrace();
            throw ex;
        } 
    }
    
}
