package cc.openhome;

import java.sql.*;
import java.util.*;

public class MessageDAO {
    private String url;
    private String user;
    private String passwd;
    
    public MessageDAO(String url, String user, String passwd) {
        this.url = url;
        this.user = user;
        this.passwd = passwd;
    }

    public void add(Message message) {
        try(Connection conn = DriverManager.getConnection(url, user, passwd);
            Statement statement = conn.createStatement()) {
            statement.executeUpdate(
                    "INSERT INTO t_message(name, email, msg) VALUES ('"
                      + message.getName() + "', '"
                      + message.getEmail() +"', '"
                      + message.getMsg() + "')");
        } catch(SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<Message> get() {
        List<Message> messages = null;
        try(Connection conn = DriverManager.getConnection(url, user, passwd);
            Statement statement = conn.createStatement()) {
            ResultSet result = statement.executeQuery("SELECT * FROM t_message");
            messages = new ArrayList<>();
            while (result.next()) {
                Message message = new Message();
                message.setId(result.getLong(1));
                message.setName(result.getString(2));
                message.setEmail(result.getString(3));
                message.setMsg(result.getString(4));
                messages.add(message);
            }
        } catch(SQLException ex) {
            throw new RuntimeException(ex);
        }
        return messages;
    }
}

