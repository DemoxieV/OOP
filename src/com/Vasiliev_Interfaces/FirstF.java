package com.Vasiliev_Interfaces;

public interface FirstF {
    String getFirst();
    default void showSmth(){
        System.out.println("Интерфейс FirstF: метод showSmth()");
    }
}
