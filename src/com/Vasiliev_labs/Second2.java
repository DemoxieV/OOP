package com.Vasiliev_labs;
//Интерфейс-наследник
public interface Second2 extends First2{
    void bravo2();

    @Override
    default void charlie3() {
        System.out.println("Интерфейс Second: метод charlie()");
    }

    void echo();
}
