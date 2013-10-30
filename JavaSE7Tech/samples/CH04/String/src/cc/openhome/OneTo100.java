package cc.openhome;

public class OneTo100 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < 100; i++) {
            builder.append(i).append('+');
        }
        System.out.println(builder.append(100).toString());
    }
}
