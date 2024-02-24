package org.example._24_02_19;

public class House {
    public static void main(String[] args) {


        Cat cat1 = new Cat("Tom", "white", 2, true);

        cat1.sayHello();
        System.out.println(cat1.isHungry());
        cat1.feed();
    }
}
