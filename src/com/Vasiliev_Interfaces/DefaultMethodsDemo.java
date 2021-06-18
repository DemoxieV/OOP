package com.Vasiliev_Interfaces;

public class DefaultMethodsDemo {
    public static void main(String[] args) {
        Base ref; //интерфейсная переменная

        Alpha objA=new Alpha("objA");
        objA.hello();
        objA.show("объектная переменная objA");

        ref=objA;
        ref.show("интерфейсная переменная ref");

        Bravo objB=new Bravo(123);
        objB.hello();
        objB.show("объектная переменная objB");

        ref=objB;
        ref.show("интерфейсная переменная ref");
    }
}
