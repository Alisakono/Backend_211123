package org.example._24_02_19;

public class Cat {
    private String name;
    private String color;
    private int age;
    private boolean isHungry;

    public Cat(String catName, String catColor, int catAge, boolean isHungry) {
        name = catName;
        color = catColor;
        age = catAge;
        this.isHungry = isHungry;
    }


    public void sayHello() {
        System.out.println("Meow I'm " + name);
    }

    public void feed() {
        isHungry = false;
        System.out.println("Cat " + name + " is not hungry ");

    }
    public boolean isHungry(){

        return false;
    }
}
