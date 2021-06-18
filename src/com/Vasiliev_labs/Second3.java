package com.Vasiliev_labs;

public interface Second3 extends First3{
    @Override
    default void alpha3() {
        First3.super.alpha3();
        System.out.println("Интерфейс Bravo: метод alpha()");
    }

    default void bravo3(){
        System.out.println("Интерфейс Bravo: метод bravo()");
    }
}
