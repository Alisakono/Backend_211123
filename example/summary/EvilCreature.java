package org.example.summary;

public class EvilCreature extends Character {
    int force;
    int protection;


    public EvilCreature(String name,int force, int protection) {
        super(name);
        this.force = force;
        this.protection = protection;
    }

    @Override
    public String toString() {
        return "EvilCreature{" +
                "force=" + force +
                ", protection=" + protection + Character.getName()+getHealth()+
                '}';
    }
}

