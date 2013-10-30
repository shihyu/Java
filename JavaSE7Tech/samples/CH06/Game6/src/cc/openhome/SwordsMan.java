package cc.openhome;

public class SwordsMan extends Role {
    public void fight() {
        System.out.println("揮劍攻擊");
    }
    
    @Override
    public String toString() {
        return "劍士 " + super.toString();
    }
}
