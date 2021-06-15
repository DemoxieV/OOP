package com.Vasiliev_labs;

public class SuperAndSubDemo {
    public static void main(String[] args) {
        Alpha objA=new Alpha();
        objA.name="alpha";
        objA.show();

        Bravo objB=new Bravo();
        objB.name="bravo";
        objB.code=123;
        objB.show();

        objA=objB;
        objA.name="charlie";
        objA.show();
        objB.show();
    }
}
