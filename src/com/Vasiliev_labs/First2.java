package com.Vasiliev_labs;

public interface First2 {
    default void alpha1(){
        System.out.println("Интерфейс First: метод alpha()");
    }

    default void bravo2(){
        System.out.println("Интерфейс First: метод bravo()");
    }

    default void charlie3(){
        System.out.println("Интерфейс First: метод charlie()");
    }

    void delta4();
}
