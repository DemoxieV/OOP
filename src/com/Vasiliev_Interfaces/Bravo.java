package com.Vasiliev_Interfaces;

public class Bravo implements Base{
    int number;

    Bravo(int n){
        number=n;
    }

    @Override
    public void hello() {
        System.out.println("Объект класса Bravo");
    }

//    @Override // не будем переопределять метод интерфейса по умолчанию, оставим как есть
//    public void show(String txt) {
//        Base.super.show(txt);
//    }

    @Override
    public void show2() {
        System.out.println("Целочисленное поле: "+number);
    }
}
