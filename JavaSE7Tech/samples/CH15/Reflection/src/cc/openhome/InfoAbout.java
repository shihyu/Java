package cc.openhome;

public class InfoAbout {
    public static void main(String[] args) {
        try {
            Class clz = Class.forName(args[0]);
            System.out.println("類別名稱：" + clz.getName());
            System.out.println("是否為介面：" + clz.isInterface());
            System.out.println("是否為基本型態：" + clz.isPrimitive());
            System.out.println("是否為陣列：" + clz.isArray());
            System.out.println("父類別：" + clz.getSuperclass().getName());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("沒有指定類別名稱");
        } catch (ClassNotFoundException e) {
            System.out.println("找不到指定的類別 " + args[0]);
        }
    }
}
