package org.example.summary;

public class Superhero extends Character {
    int force;
    Protection protection;
    Weapon weapon;


    public Superhero(String name, int force, Protection protection, Weapon weapon) {
        super(name);
        this.force = force;
        this.protection = protection;
        this.weapon = weapon;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public Protection getProtection() {
        return protection;
    }

    public void setProtection(Protection protection) {
        this.protection = protection;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Superhero{" +
                "force=" + force +
                ", protection=" + protection +
                ", weapon=" + weapon +
                ", getName=" + Character.getName()+getHealth()+
                '}';
    }
}

