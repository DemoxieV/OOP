package com.Vasiliev_Polymorphism;

public class Bravo4 extends Alpha4{
    @Override
    void objectCreated() {
        System.out.println("Создан объект класса Bravo");
    }

    @Override
    void hello() {
        System.out.println("Объект класса Bravo");
    }

    Bravo4(String txt){
        super(txt);
    }
}
