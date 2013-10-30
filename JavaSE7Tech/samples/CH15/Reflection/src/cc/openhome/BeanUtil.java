package cc.openhome;

import java.lang.reflect.*;
import java.util.*;
import java.util.logging.Logger;

public class BeanUtil {
    public static Object getBean(Map<String, Object> data, String clzName) throws Exception {
        Class clz = Class.forName(clzName);
        Object bean = clz.newInstance();
        for(String key : data.keySet()) {
            // 取得 setter 方法名稱
            String setter = String.format("set%s%s",
                    key.substring(0, 1).toUpperCase(), key.substring(1));
            // 取得參數值
            Object value = data.get(key);
            try {
                // 根據方法名稱與參數型態取得 Method 實例
                Method method = clz.getMethod(setter, value.getClass());
                // 必須是公開方法
                if(Modifier.isPublic(method.getModifiers())) {
                    method.invoke(bean, value);
                }
            } catch(NoSuchMethodException ex) {
                Logger.getLogger(BeanUtil.class.getName()).warning(
                        String.format("沒有 %s 方法", setter) );
            }
        }
        return bean;  
    }
}
