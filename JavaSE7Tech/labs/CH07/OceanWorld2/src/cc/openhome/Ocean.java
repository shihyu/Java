package cc.openhome;

public class Ocean {
    public static void doSwim(Fish fish) {
        fish.swim();
    }
    
    public static void doSwim(Human human) {
        human.swim();
    }
    
    public static void doSwim(Submarine submarine) {
        submarine.swim();
    }
    
    public static void main(String[] args) {
        doSwim(new Anemonefish("尼莫"));
        doSwim(new Shark("蘭尼"));
        doSwim(new Human("賈斯汀"));
        doSwim(new Submarine("黃色一號"));
    }
}
