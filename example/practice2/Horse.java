package org.example.practice2;

public class Horse {
   protected String name;
    protected int weight;
    protected int speed;

    protected void run() {
        System.out.println(name + " бежит со скоростью  " + speed);
    }

    public Horse(String name, int wight, int speed) {
        this.name = name;
        this.weight = wight;
        this.speed = speed;
    }

    public Horse() {
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                '}';
    }
}