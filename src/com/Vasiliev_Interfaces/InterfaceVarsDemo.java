package com.Vasiliev_Interfaces;
//использование интерфейсной переменной, которая может ссылать на объект класса, реализующего этот интерфейс
public class InterfaceVarsDemo {
    public static void main(String[] args) {
        Base ref;
        ref=new Alpha("текст");
        ref.show2();
        ref=new Bravo(123);
        ref.show2();
    }
}
