package org.example.summary;

public class SuperheroBattle {
    public static void main(String[] args) {
        Weapon weapon = new Weapon("Sword", 10);
        Protection protection = new Protection("Armor",8);

        EvilCreature evilCreature = new EvilCreature("Bat",10,1);
        Superhero superhero = new Superhero("Batman",7,protection,weapon);
        System.out.println(superhero);
        System.out.println(evilCreature);


    }
}

