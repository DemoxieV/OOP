package com.Vasiliev_Polymorphism;

public class OverrideDemo {
    public static void main(String[] args) {
        Alpha2 objA=new Alpha2("objA");
        Bravo2 objB=new Bravo2("objB",123);
        objA.show();
        objB.show();
    }
}
