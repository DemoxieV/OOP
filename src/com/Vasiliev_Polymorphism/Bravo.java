package com.Vasiliev_Polymorphism;

public class Bravo extends Alpha{
    int code;

    @Override
    void show() {
        System.out.println("Объект класса Bravo:");
        System.out.println("Поле name - "+name);
        System.out.println("Поле code - "+code);
    }

    Bravo(String name, int code){
        super(name);
        this.code=code;
    }
}
