package org.example.summary;

public abstract class Character {
    private String name;
    private int health = 100;

    public Character(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("Hello, my name is "+name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public abstract void countForce();
    public abstract void countProtection();

    public void fight() {
        countForce();
        countProtection();
    }
}
