package com.Vasiliev_Polymorphism;

public class Alpha4 {
    String name;

    void objectCreated(){
        System.out.println("Создан объект класса Alpha");
    }

    void hello(){
        System.out.println("Объект класса Alpha");
    }

    void show(){
        hello();
        System.out.println("Поле name: "+name);
    }

    Alpha4(String txt){
        objectCreated();
        name=txt;
    }
}
