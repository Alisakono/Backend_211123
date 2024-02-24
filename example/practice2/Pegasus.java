package org.example.practice2;

public class Pegasus extends Horse{
    private int speedFly;

    public Pegasus(String name, int wight, int speed, int speedFly) {
        super(name, wight, speed);
        this.speedFly = speedFly;

    }
    public void fly(){
        System.out.println(name+" летает со скоростью "+speedFly);
    }

    @Override
    public String toString() {
        return "Pegasus{" +
                "speedFly=" + speedFly +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", speed=" + speed +
                '}';
    }
}


