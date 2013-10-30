/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cc.openhome;

import java.sql.SQLException;
import javax.sql.rowset.*;

/**
 *
 * @author Justin
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        RowSetFactory rowSetFactory = RowSetProvider.newFactory();
        JdbcRowSet rowset = rowSetFactory.createJdbcRowSet();
        rowset.setUrl("jdbc:mysql://localhost:3306/demo");
        rowset.setUsername("root");
rowset.setPassword("123456");
rowset.setCommand("SELECT * FROM t_message WHERE id = ?");
rowset.setInt(1, 1);
rowset.execute();

    }
}
