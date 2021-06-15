package com.Vasiliev_Polymorphism;

public class MoreOverridingDemo {
    public static void main(String[] args) {
        Alpha objA=new Alpha("objA");
        Bravo2 objB=new Bravo2("objB",123);
        objA.show();
        objB.show();
    }
}
