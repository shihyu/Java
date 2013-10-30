package cc.openhome;

class Clothes {
    String color;
    char size;
}

public class Field {
    public static void main(String[] args) {
        Clothes c1 = new Clothes();
        Clothes c2 = new Clothes();
        
        c1.color = "red";
        c1.size = 'S';
        c2.color = "green";
        c2.size = 'M';
        
        System.out.printf("c1 (%s, %c)%n", c1.color, c1.size);
        System.out.printf("c2 (%s, %c)%n", c2.color, c2.size);
    }
}
