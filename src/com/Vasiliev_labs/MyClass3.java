package com.Vasiliev_labs;

public class MyClass3 implements Second3{
    @Override
    public void bravo3() {
        Second3.super.bravo3();
        System.out.println("Класс MyClass: метод bravo()");
    }
}
