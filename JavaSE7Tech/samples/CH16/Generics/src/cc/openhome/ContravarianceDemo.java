package cc.openhome;

import java.util.Comparator;

public class ContravarianceDemo {
    public static void main(String[] args) {
        Comparator<Fruit> priceComparator = new Comparator<>() {
            @Override
            public int compare(Fruit fruit1, Fruit fruit2) {
                return fruit1.price - fruit2.price;
            }
        };
        Basket<Apple> apples = new Basket<>(
                new Apple(25, 150), new Apple(20, 100));
        apples.sort(priceComparator);
        for(Apple apple : apples.things) {
            System.out.printf("Apple(%d, %d) ", apple.price, apple.weight);
        }
        System.out.println();
        
        Basket<Banana> bananas = new Basket<>(
                new Banana(50, 300), new Banana(30, 200));
        bananas.sort(priceComparator);
        for(Banana banana : bananas.things) {
            System.out.printf("Banana(%d, %d) ", banana.price, banana.weight);
        }
        System.out.println();
    }
}
