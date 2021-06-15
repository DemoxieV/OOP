package com.Vasiliev_Polymorphism;

public class Alpha {
    String name;

    void show(){
        System.out.println("Объект класса Alpha:");
        System.out.println("Поле name - "+name);
    }

    Alpha(String name){
        this.name=name;
    }
}
