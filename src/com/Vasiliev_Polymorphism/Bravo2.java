package com.Vasiliev_Polymorphism;

public class Bravo2 extends Alpha2{
    int code;

    @Override
    void show() {
        super.show();
        System.out.println("Числовое поле "+code);
    }

    Bravo2(String name, int code){
        super(name);
        this.code=code;
    }
}
