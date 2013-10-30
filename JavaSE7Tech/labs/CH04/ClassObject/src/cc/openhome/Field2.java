package cc.openhome;

class Clothes2 {
    String color;
    char size;
    /*
     * 補上建構式
     */
}

public class Field2 {
    public static void main(String[] args) {
        // 按照範例修改以下內容
        Clothes2 c1 = new Clothes2();
        Clothes2 c2 = new Clothes2();
        
        c1.color = "red";
        c1.size = 'S';
        c2.color = "green";
        c2.size = 'M';
        
        System.out.printf("c1 (%s, %c)%n", c1.color, c1.size);
        System.out.printf("c2 (%s, %c)%n", c2.color, c2.size);
    }
}
