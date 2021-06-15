package com.Vasiliev_Polymorphism;

public class OverloadOverrideDemo {
    public static void main(String[] args) {
        Alpha5 objA=new Alpha5();
        objA.show();
        objA.show("Объект objA");
        Bravo5 objB=new Bravo5();
        objB.show();
        objB.show("Объект objB");
        objB.show(123);
    }
}
