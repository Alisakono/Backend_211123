package org.example._24_02_21;

public class Parent {
    public int publicField = 10;

    private int privateField = 10;
    public void publicMethod(){
        System.out.println("Parent public method");
    }
    private void privateMethod(){
        System.out.println("Parent privet method");
    }
    public int getPrivateField() {
        return privateField;
    }

    public void setPrivateField(int privateField) {
        this.privateField = privateField;
    }
}
