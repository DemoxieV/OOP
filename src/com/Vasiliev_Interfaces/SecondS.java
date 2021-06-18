package com.Vasiliev_Interfaces;

public interface SecondS {
    String getSecond();
    default void showSmth(){
        System.out.println("Интерфейс SecondS: метод showSmth()");
    }
}
