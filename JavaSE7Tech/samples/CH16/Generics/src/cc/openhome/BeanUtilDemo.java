package cc.openhome;

import java.util.*;

public class BeanUtilDemo {
    public static void main(String[] args) throws Exception {
        Map<String, Object> data = new HashMap<>();
        data.put("name", "Justin");
        data.put("score", 90);
        Student student = BeanUtil.getBean(data, "cc.openhome.Student"); 
        // 底下顯示(Justin, 90)
        System.out.printf("(%s, %d)%n", student.getName(), student.getScore());
    }
}
