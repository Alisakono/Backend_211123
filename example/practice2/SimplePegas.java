package org.example.practice2;

public class SimplePegas {
    public static void main(String[] args) {
        Horse horse = new Horse("Wasya",1010,120);
        System.out.println(horse);

        Horse horse1 = new Horse("Bulat",1200,150);
        System.out.println(horse1);

        Pegasus pegasus1 = new Pegasus("Pegas",1300,60,50);
        pegasus1.run();
        pegasus1.fly();
        System.out.println(pegasus1);

       Unicorn unicorn1 = new Unicorn(" Единорог",5000,40,true);
       unicorn1.run();
       unicorn1.fight();
        System.out.println(unicorn1);

        SwimmingUnicorn swUnicorn1 = new SwimmingUnicorn("Дельфин",500,50,true,20);
        swUnicorn1.run();
        swUnicorn1.fight();
        swUnicorn1.swim();
        System.out.println(swUnicorn1);
    }
}
