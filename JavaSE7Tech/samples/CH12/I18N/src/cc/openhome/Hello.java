package cc.openhome;

import java.util.ResourceBundle;

public class Hello {
    public static void main(String[] args) {
        ResourceBundle res = ResourceBundle.getBundle("messages");
        System.out.print(res.getString("cc.openhome.welcome") + "!");
        System.out.println(res.getString("cc.openhome.name") + "!");
    }
}
