package com.Vasiliev_Interfaces;
//Использование метода по умолчанию
public interface Base {
    default void show(String txt){
        System.out.println("Интерфейс Base: "+txt);
    }

    void show2();

    void hello();
}
