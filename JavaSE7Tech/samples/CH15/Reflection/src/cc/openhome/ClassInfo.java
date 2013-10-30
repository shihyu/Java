package cc.openhome;

public class ClassInfo {
    public static void main(String[] args) {
        Class clz = String.class;
        System.out.println("類別名稱：" + clz.getName());
        System.out.println("是否為介面：" + clz.isInterface());
        System.out.println("是否為基本型態：" + clz.isPrimitive());
        System.out.println("是否為陣列物件：" + clz.isArray());
        System.out.println("父類別名稱：" + clz.getSuperclass().getName());
    }    
}
