package org.example._24_02_21;

public class UseChildAndParent {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        System.out.println(child.publicField);

        System.out.println(child.getPrivateField());
        child.publicMethod();
    }
}
